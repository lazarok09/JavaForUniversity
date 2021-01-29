
package Heranca.src.heranca;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    // construtor
    public Professor(String especialidade, float salario) {
        this.especialidade = especialidade;
        setSalario(salario);
    }

    // métodos
    public void receberAumento(float valor) {
        this.setSalario(this.getSalario() + valor);
    }
    // getters and setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario >= 1045) {

            this.salario = salario;

        } else {
            System.out.println("Erro! o valor do salário deve ser igual | superior ao salário mínimo Brasileiro");
        }
    }

    @Override
    public String mostrarConteudo() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + " nome=" + this.getNome()
                + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + '}';
    }

}
