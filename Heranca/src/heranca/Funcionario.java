package Heranca.src.heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando = false;
    // métodos

    public Funcionario(String setor, boolean trabalhando) {
        setSetor(setor);
        setTrabalhando(trabalhando);
    }

    public Funcionario(String setor) {
        setSetor(setor);
    }

    public void mudarTrabalho() {
        setTrabalhando(true);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String mostrarConteudo() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + " nome=" + this.getNome()
                + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + '}';
    }

}
