
public class Heranca2B {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Jao");
        a1.setIdade(17);
        a1.setCurso("ADS");
        a1.setMatricula(1654321);
        a1.setSexo("masculino");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Aluno a2 = new Aluno();
        a2.setNome("Mariana");
        a2.setIdade(16);
        a2.setCurso("Designer");
        a2.setMatricula(1220636);
        a2.setSexo("feminino");
        System.out.println(a2.toString());
        a2.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Carlos");
        b1.setIdade(18);
        b1.setCurso("Programador");
        b1.setMatricula(14258695);
        b1.setSexo("masculino");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        b1.renovarBolsa();

        Tecnico tec = new Tecnico();

        tec.setNome("Wanessa");
        tec.setIdade(18);
        tec.setSexo("feminino");
        tec.setMatricula(165423);
        tec.setCurso("Analise e Dev de Sistemas");
        tec.fazerAniversario();
        System.out.println(tec.toString());
        tec.pagarMensalidade();
        tec.praticar();

    }
}