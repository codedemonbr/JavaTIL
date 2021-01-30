package classe;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
	}

	String ObterDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	void ImprimirDataFormatada() {
		System.out.println(ObterDataFormatada());
	}
}
