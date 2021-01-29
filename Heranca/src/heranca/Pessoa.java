package Heranca.src.heranca;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    // métodos
    public void fazerAniversario() {
        if (this.idade != 0 && this.idade < 130) {
            this.idade++;
        }
    }

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
        if (idade >= 1 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Falha ao construir idade, número inválido");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        switch (sexo) {
            case "M":
                this.sexo = "Masculino";
                break;
            case "F":
                this.sexo = "Feminino";
                break;
            default:
                System.out.println("Escolha M para masculino ou F para feminino");
        }
    }
    // to string

    public String mostrarConteudo() {
        return "Pessoa{" + "nome=" + this.getNome() + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

}
