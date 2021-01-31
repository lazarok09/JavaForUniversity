
public class Mamifero extends Animal {
    // atributos
    private String corPelo;

    // métodos
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // sobrescrições
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public void mostrarStatus() {
        System.out.println("Exibindo características do mamífero");
        System.out.println("Pelo= " + this.getCorPelo() + " idade= " + this.getIdade() + " Membros= "
                + this.getMembros() + " Peso= " + this.getPeso());
    }

}
