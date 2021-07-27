package fundamentos;

/**
 * VolumeCilindro
 */
public class VolumeCilindro {

    double raio;
    double altura;
    static final double PI = 3.14159265359;

    VolumeCilindro(double raioInicial, double alturaInicial) {
        raio = raioInicial;
        altura = alturaInicial;
    }

    double volume() {
        return (Math.pow(raio, 2)) * PI * altura;
    }

    static double raioInv(double volumeTest, double alturaTest) {

        double r = (volumeTest / (PI * alturaTest));
        return (Math.sqrt(r));
    }
    
    double densidadeConcreto(double densidade){
        return 0;
    }

    public static void main(String[] args) {
        VolumeCilindro v1 = new VolumeCilindro(36.5, 5);
        double vol = v1.volume();
        System.out.println(vol);

        System.out.println(raioInv(4021, 5));
    }
}