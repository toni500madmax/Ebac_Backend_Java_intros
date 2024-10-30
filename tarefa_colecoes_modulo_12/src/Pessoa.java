public class Pessoa {
    private String nome;
    private Genero sexo;
    private Integer idade;

    public Pessoa(String nome, Genero sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Genero getSexo() {
        return sexo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: "
                + this.nome + ", idade:"
                + this.idade
                + ", gênero: "
                + this.sexo + ";");
        return sb.toString();
    }
}
