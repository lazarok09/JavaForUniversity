
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniversario() {
        this.idade++;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.getNome() + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

}