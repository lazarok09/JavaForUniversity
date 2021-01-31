
public class Ave extends Animal {
    // atributos
    private String corPena;

    // métodos
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    // sobrescrições
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void mostrarStatus() {
        System.out.println("Exibindo características de AVE");
        System.out.println("Pena= " + this.getCorPena() + " idade= " + this.getIdade() + " Membros= "
                + this.getMembros() + " Peso= " + this.getPeso());
    }

}
