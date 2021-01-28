package aula09b;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario() {
    if(this.getIdade() != 0) {
    this.setIdade(this.getIdade() + 1);
     }
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        setIdade(idade);
        setSexo(sexo);
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 125) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        if(sexo.equals("Masculino") | sexo.equals("Feminino") ) {
            this.sexo = sexo;
        } else {
            System.out.println("ERRO. São válidos apenas 'Masculino' e 'Feminino'!");
        }
    }
}