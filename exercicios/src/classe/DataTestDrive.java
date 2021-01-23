package classe;

// import classe.Data;

public class DataTestDrive {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();

		d1.ano = 1990;
		d1.mes = 12;
		d1.dia = 7;

		d2.ano = 1980;
		d2.mes = 12;
		d2.dia = 15;

		System.out.println("D1 - " + d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.println("D2 - " + d2.dia + "/" + d2.mes + "/" + d2.ano);
	}
}
