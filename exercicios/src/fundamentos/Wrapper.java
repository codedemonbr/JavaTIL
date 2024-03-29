package fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;

        Integer i = 10000;// Integer.parseInt(entrada.next());
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.40F;
        System.out.println(f);

        Double d = 1234.456;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");

    }
}
