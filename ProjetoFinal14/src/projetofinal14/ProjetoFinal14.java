package projetofinal14;

public class ProjetoFinal14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 14 de Polimorfismo");
        v[2] = new Video("Aula 12 de PHP");
        // gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Lazo", 17, "masculino", "lazarok", 28);
        g[1] = new Gafanhoto("Herbert", 19, "masculino", "herbetjunior", 25);
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // lazaro assiste aula 12 de php
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); // lazaro assiste aula 14 de polimorfismo
        vis[0].avaliar(80f);
        System.out.println(vis[0].toString());
        
        /*
        System.out.println("Videos \n ---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("Gafanhotos \n ----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString()); 
            */
    }

}
