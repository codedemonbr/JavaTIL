package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;

	double PrecoComDesconto() {
		return this.preco * (1 - this.desconto);
	}
}
