package UnityOne;

import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double largura, profundidade, valor_m2, valor;

        System.out.println("Digite o valor da largura do terreno");
        largura = leia.nextDouble();
        System.out.println("Digite o valor da profundidade do terreno");
        profundidade = leia.nextDouble();
        System.out.println("Digite o valor do metro quadrado do terreno");
        valor_m2 = leia.nextDouble();

        valor = largura * profundidade * valor_m2;
        leia.close();
        System.out.println("\n -= < Valores do terreno > = -");
        System.out.println("Largura do terreno " + largura + "m");
        System.out.println("Profundidade do terreno " + profundidade + "m");
        System.out.println("Valor do metro quadrado: R$ " + valor_m2);
        System.out.println("Área total do terreno " + (largura * profundidade) + valor_m2);
        System.out.println("Valor do terreno : R$" + valor);
    }

}
