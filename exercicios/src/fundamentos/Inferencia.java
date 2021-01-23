package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Um texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
//		c = 5.6;
		
		double d;
		d = 123.65;
		System.out.println(d);
		
		var e = 123.45;
		System.out.println(e);
		
		/**
		 * Resumindo tudo o que foi escrito acima. Java consegue inferir tipo. Mas uma vez definido, isso se torna estático
		 */
		
	}
}
