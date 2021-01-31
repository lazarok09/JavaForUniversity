
public class Reptil extends Animal {
    // atributos
    private String corEscama;

    // métodos
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // sobrescrições
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    public void mostrarStatus() {
        System.out.println("Exibindo características do réptil");
        System.out.println("Cor da escama= " + this.getCorEscama() + " idade= " + this.getIdade() + " Membros= "
                + this.getMembros() + " Peso= " + this.getPeso());
    }

}
