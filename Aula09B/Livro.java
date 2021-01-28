package aula09b;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    //methods

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor +
        ",\n totalPaginas=" + totalPaginas + ",\n paginaAtual=" + paginaAtual +
        ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + 
        ",\n idade=" + leitor.getIdade() + ", \nsexo= " + leitor.getSexo() +'}';
    }
    

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if(pagina <= this.totalPaginas) {
            this.paginaAtual = pagina;
        } else {
            System.out.println("Você só pode folhear até o total de páginas :(");
        }
        
    }

    @Override
    public void avancarPagina() {
        if(this.aberto) {
        this.paginaAtual++;
        } else {
            System.out.println("Abra o livro antes de abrir");
        }
        
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
    
}

