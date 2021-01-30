
public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    // pagar mensalidade é overrride
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista, o pagamento é facilitado");
    }

}