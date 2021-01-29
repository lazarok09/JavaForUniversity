package Heranca.src.heranca;

public class Heranca {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();

    p1.setSexo("F");
    p1.setNome("SuperClasse");
    p1.setIdade(1);
    System.out.println(p1.mostrarConteudo());

    Aluno p2 = new Aluno();
    p2.setSexo("M");
    p2.setNome("Lazooo");
    p2.setIdade(20);
    p2.setCurso("ADS");
    p2.setMatricula(1156485632);
    p2.setAtivo(true);
    System.out.println(p2.mostrarConteudo());

    Professor p3 = new Professor("Escritor", 51060f);
    p3.setIdade(27);
    p3.setNome("Robert Cecil Martin");
    p3.setIdade(69);
    p3.setSexo("M");
    System.out.println(p3.mostrarConteudo());

    Funcionario p4 = new Funcionario("Militar");
    p4.setIdade(36);
    p4.setNome("João Cândido");
    p4.setIdade(82);
    p4.setSexo("M");
    p4.setTrabalhando(true);
    System.out.println(p4.mostrarConteudo());

  }

}
