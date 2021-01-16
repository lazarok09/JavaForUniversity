package Principal;

public class Principal {
    public static void main(String[] args) {
        Celular novoCelular = new Celular();
        novoCelular.modelo = "Samsung Galaxy S10";
        novoCelular.numero = 86345592;
        novoCelular.ligar();
        System.out.println(novoCelular.modelo);
        System.out.println(novoCelular.numero);

    }
}
