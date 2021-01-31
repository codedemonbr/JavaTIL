package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notaAlunoA = new double[4];
        System.out.println(Arrays.toString(notaAlunoA));

        notaAlunoA[0] = 7.9;
        notaAlunoA[1] = 8;
        notaAlunoA[2] = 6.7;
        notaAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notaAlunoA));

        double total = 0;
        for (int i = 0; i < notaAlunoA.length; i++) {
            total += notaAlunoA[i];

        }
        System.out.println(total / notaAlunoA.length);

        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
        total = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            total += notasAlunoB[i];
        }
        System.out.println(total / notasAlunoB.length);
    }
}
