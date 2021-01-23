package cursoemvideo5;

import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random numeroRandomico = new Random();
        Scanner s = new Scanner(System.in);

        /* Me pede um número da conta, o tipo e nome do dono */
        System.out.println("Seu nome jovem gafanhoto?");
        String nome = s.next();
        final int NR = numeroRandomico.nextInt(3);

        ContaBanco lazaro = new ContaBanco(NR, nome);
        // change to "cp" the param on 'abrirConta to see other results :D
        lazaro.abrirConta("cc");
        // to see the getters and setters write lazaro. and press control + space

        lazaro.getAll();
        lazaro.sacar(50);
        lazaro.getAll();

    }
}
