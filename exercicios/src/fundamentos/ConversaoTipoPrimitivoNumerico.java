package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);

        float b = (float) 1.123564997777;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999999;
        int f = (int) e;
        System.out.println(f);
    }
}
