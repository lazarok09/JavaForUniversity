package projetofinal14;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        
    }
    // 3 formas de avaliar sobrecarga
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        if (nota <= 10) {
            this.filme.setAvaliacao(nota);
        } else {
            this.filme.setAvaliacao(10);
        }
    }
    public void avaliar(float porcentagem) {
        int tot = 0;
        if(porcentagem <= 20) {
        tot = 3;
    } else if (porcentagem > 20 && porcentagem <50) {
        tot = 5;
    } else if (porcentagem <= 90) {
        tot = 8;
      } else {
        tot = 10;
    }
        this.filme.setAvaliacao(tot);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualicao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    

}
