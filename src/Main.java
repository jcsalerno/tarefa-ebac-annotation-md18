public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", "Honda");

        Class<?> classeDoObjeto = carro.getClass();

        if (classeDoObjeto.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = classeDoObjeto.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A classe não possui a annotation @Tabela.");
        }
    }
}