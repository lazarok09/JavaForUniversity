package Heranca.src.heranca;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private boolean ativo;

    // métodos
    public void cancelarMatricula() {
        if (this.matricula != 0) {
            System.out.println("Matrícula cancelada!");
            setCurso("Trancado ou inativo");
            setAtivo(false);
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula >= 1) {
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String mostrarConteudo() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + ", ativo=" + ativo + " nome=" + this.getNome()
                + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + '}';
    }

}
