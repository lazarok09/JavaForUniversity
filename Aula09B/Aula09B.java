package aula09b;

public class Aula09B {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro  l[] = new Livro[3];
        p[0] = new Pessoa("Hermione", 26, "Feminino");
        p[1] = new Pessoa("Harry", 25, "Masculino");
        
        l[0] = new Livro("Harry Potter e a pedra filosofal", "Shonda Rhimes", 500, p[0]);
        l[1] = new Livro("Harry Potter e o prisioneiro de Azkban", "Shonda Rhimes", 430, p[1]);
        l[2] = new Livro("Hary Potter e a ordem da fenix", "Shonda Rhimes", 850, p[1]);
        l[0].abrir();
        l[0].avancarPagina();
        l[0].folhear(480);
        System.out.println(l[0].detalhes());

    }
    
}
