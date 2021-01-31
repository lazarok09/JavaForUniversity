
public class Polimorfismo12b {
    public static void main(String[] args) {

        // dog caramelo
        System.out.println("--DogCaramelo--");
        Mamifero d = new Cachorro();
        d.setCorPelo("Caramelo");
        d.setIdade(7);
        d.setPeso(14f);
        d.setMembros(4);
        d.alimentar();
        d.locomover();
        d.emitirSom();
        d.mostrarStatus();
        // canguru que também é mamífero
        System.out.println("--Canguru Jack--");
        Canguru c = new Canguru();
        c.setCorPelo("Marrom");
        c.setIdade(14);
        c.setPeso(64f);
        c.setMembros(4);
        c.alimentar();
        c.emitirSom();
        c.locomover();
        c.usarBolsa();
        c.mostrarStatus();
        // betta
        System.out.println("--BETTA--");
        Peixe p = new Betta();
        p.setCorEscama("azul");
        p.setPeso(1.2f);
        p.setMembros(2);
        p.setIdade(1);
        p.locomover();
        p.alimentar();
        p.soltarBolha();
        p.emitirSom();
        p.mostrarStatus();
        // Tartaruga
        System.out.println("--Reptil--");
        Reptil r = new Tartaruga();
        r.setCorEscama("marrom");
        r.setPeso(130f);
        r.setMembros(4);
        r.setIdade(150);
        r.alimentar();
        r.emitirSom();
        r.locomover();
        r.mostrarStatus();
        // Arara
        Ave a = new Arara();
        a.setCorPena("Azul");
        a.setIdade(30);
        a.setPeso(2f);
        a.setMembros(4);
        a.mostrarStatus();
        a.emitirSom();
        a.fazerNinho();
        a.alimentar();

    }

}
