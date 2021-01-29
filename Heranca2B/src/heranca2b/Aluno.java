package heranca2b;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    // metodo
    public void pagarMensalidade() {
        String x;
        String y;
        if ( this.getSexo() == "masculino") {
        x = "o ";
        y = "o";
         System.out.format("Pagando mensalidade d%s alun%s" + this.getNome() + ".", y, x);
           System.out.println("");

        } else if (this.getSexo() == "feminino"){
            x = "a ";
            y = "a";
         System.out.format("Pagando mensalidade d%s alun%s" + this.getNome(), y, x);
            System.out.println("");
          } else {
            System.out.println("Escolha 'masculino' ou 'feminino'");
         }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + " nome=" + this.getNome() +
                " idade=" + this.getIdade() + " sexo=" + this.getSexo() + '}';
    }
    

}
