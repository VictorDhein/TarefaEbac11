package Module11;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo; // 'M' para Masculino, 'F' para Feminino.

    // Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter para sexo
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Método toString para exibir as informações da pessoa
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo;
    }
}
