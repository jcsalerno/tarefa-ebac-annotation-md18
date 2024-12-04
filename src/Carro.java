@Tabela(nome = "carros")
public class Carro {
    private String modelo;
    private String marca;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}
