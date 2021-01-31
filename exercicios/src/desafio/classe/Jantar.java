package desafio.classe;

/**
 * Jantar
 */
public class Jantar {

    public static void main(String[] args) {

        Comida carneBovina = new Comida("Filé Mignon", 0.250);
        Comida carneFrango = new Comida("Coxa e Sobrecoxa", .5);
        Pessoa pedro = new Pessoa("Pedro", 70);

        System.out.println(pedro.nome + " - " + pedro.peso + "kg antes");
        System.out.println(pedro.Comer(carneBovina));
        System.out.println(pedro.Comer(carneFrango));
        System.out.println(pedro.nome + " - " + pedro.peso + "kg depois");

    }

}