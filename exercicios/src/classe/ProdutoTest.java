package classe;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4532.65);

		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 1.65;

		Produto.desconto = 0.5;

		System.out.println(p1.nome + " " + p1.PrecoComDesconto());
		System.out.println(p2.nome + " " + p2.PrecoComDesconto());

		double precoFinal1 = p1.PrecoComDesconto();
		double precoFinal2 = p2.PrecoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
	}
}
