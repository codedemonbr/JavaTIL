package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe salario 1: ");
        String valor1 = scanner.next().replace(",", ".");
        Double sal1 = Double.parseDouble(valor1);

        System.out.println("Informe salario 2: ");
        String valor2 = scanner.next().replace(",", ".");
        Double sal2 = Double.parseDouble(valor2);

        System.out.println("Informe salario 3: ");
        String valor3 = scanner.next().replace(",", ".");
        Double sal3 = Double.parseDouble(valor3);

        Double soma = sal1 + sal2 + sal3;
        Double media = soma / 3;

        System.out.println("Soma " + soma);
        System.out.println("Média " + media);

        scanner.close();
    }
}
