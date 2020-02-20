package entities;

public class Produto {

	private String nome;
	private Double preco;
	private int quantidade;
	private double total;

	public Produto() {
	}
	
	
	
	public Produto(String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return preco;
	}

	public void setValor(Double valor) {
		preco = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getTotal() {
		return total;
	}

	public double setTotal(double total) {
		this.total = total;
		return total;
	}

	public double valorFinal() {
		return this.total = (preco * quantidade);
	}

}
