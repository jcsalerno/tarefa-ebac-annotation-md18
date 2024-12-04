# Projeto: Annotation `@Tabela` em Java - EBAC

Este projeto demonstra como criar e usar uma **annotation personalizada** chamada `@Tabela` em Java. A annotation é utilizada para associar um nome de tabela a uma classe, e o programa permite acessar o valor dessa annotation em tempo de execução usando reflexão.

## 🛠 Funcionalidades

- Criação de uma annotation personalizada `@Tabela`.
- Uso da annotation para associar um nome de tabela a uma classe.
- Leitura e manipulação da annotation em tempo de execução com reflexão.

## 📝 Estrutura do Projeto

### Classes e Annotations

1. **Annotation `@Tabela`**:
    - Annotation personalizada criada com `@interface`.
    - Atributo: `nome` (String) — define o nome da tabela associado à classe.
    - Retenção: `RUNTIME` (disponível em tempo de execução).

2. **Classe `Carro`**:
    - Representa um objeto simples com os atributos `modelo` e `marca`.
    - Anotada com `@Tabela(nome = "carros")`.

3. **Classe `Main`**:
    - Contém o método principal que:
        - Verifica se a annotation `@Tabela` está presente na classe `Carro`.
        - Obtém o valor do atributo `nome` da annotation e o exibe no console.