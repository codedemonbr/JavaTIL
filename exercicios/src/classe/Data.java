package classe;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;

	String ObterDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	void ImprimirDataFormatada() {
		System.out.println(ObterDataFormatada());
	}
}
