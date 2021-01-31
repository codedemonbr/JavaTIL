package desafio.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanNotas = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que deseja calcular");
        int length = scanNotas.nextInt();
        double notas[] = new double[length];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = scanNotas.nextDouble();
        }

        System.out.println(Arrays.toString(notas));
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("A média desse arrombado é " + media);
        scanNotas.close();
    }

}
