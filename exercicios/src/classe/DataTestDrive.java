package classe;

// import classe.Data;

public class DataTestDrive {
	public static void main(String[] args) {
		Data d1 = new Data(7, 12, 1990);
		Data d2 = new Data();

		d2.ano = 1980;
		d2.mes = 12;
		d2.dia = 15;

		System.out.println("D1 - " + d1.ObterDataFormatada());
		System.out.println("D2 - " + d2.ObterDataFormatada());

		d1.ImprimirDataFormatada();
		d2.ImprimirDataFormatada();
	}
}
