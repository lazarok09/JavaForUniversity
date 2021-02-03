package projetofinal14;

public class Video implements AcoesVideo {
    private boolean reproduzindo;
    private int views;
    private int curtidas;
    private int avaliacao;
    private String titulo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        
    }
    
    
    @Override
    public void play(String filme) {
        System.out.println("iniciando o filme " + filme);
        setTitulo(filme);
        setReproduzindo(true);
        setViews(this.getViews() + 1);
        
    }

    @Override
    public void pause() {
        if(isReproduzindo()) {
        System.out.println("Pausado");
        setReproduzindo(false);
        } else {
            System.out.println("Não pode pausar sem reproduzir");
        }
    }

    @Override
    public void like() {
        System.out.println("Dando like no vídeo " +this.getTitulo());
        setCurtidas(this.getCurtidas() + 1);
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        // recebendo somente a parte inteira
        nova = (int) (this.avaliacao + avaliacao) / this.views;
        
        this.avaliacao = nova;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Video{" + "reproduzindo=" + reproduzindo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + ", titulo=" + titulo + '}';
    }
    

}
