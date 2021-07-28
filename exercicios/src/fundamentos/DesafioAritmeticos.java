package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        Integer a = 3 + 2;
        Integer b = 6 * a;
        Integer c = (int) Math.pow(b, 2);
        Integer d = c / (3 * 2);

        // PARTE I
        System.out.println(d);
        /**
         * Para facilitar separei as operações em partes para que fique mais façil o
         * entendimento. Existe a possibilidade de fazer tudo em apenas uma linha usando
         * regra de precedencia, mas é muito mais saudavel separar problemas maiores em
         * menores.
         */

        Integer e = 1 - 5;
        Integer f = 2 - 7;
        Integer g = e * f / 2;
        Integer h = (int) Math.pow(g, 2);

        // PARTE II
        System.out.println(h);

        Integer i = d - h;

        Integer j = (int) Math.pow(i, 3);
        Integer k = (int) Math.pow(10, 3);

        System.out.println(j / k);

    }
}