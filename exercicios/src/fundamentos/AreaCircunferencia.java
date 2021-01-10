package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		final double PI = 3.141519;
		double raio = 3;
		
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio *raio;
		
		System.out.println("Area " + area + "m²");
	}
}
