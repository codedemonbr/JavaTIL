package classe;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;

	Data(int diaInicial, int mesInicial, int anoIncial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoIncial;
	}

	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	String ObterDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	void ImprimirDataFormatada() {
		System.out.println(ObterDataFormatada());
	}
}
