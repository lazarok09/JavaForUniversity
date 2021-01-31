
public class Peixe extends Animal {
    // atributos
    private String corEscama;
    // métodos

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // sobrescrições
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void mostrarStatus() {
        System.out.println("Características do peixe");
        System.out.println("Escama= " + this.getCorEscama() + " idade= " + this.getIdade() + " Membros= "
                + this.getMembros() + " Peso= " + this.getPeso());
    }

}
