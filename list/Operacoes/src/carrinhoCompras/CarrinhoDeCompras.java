package carrinhoCompras;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	List<Item> carrinho = new ArrayList<>();
	
	public CarrinhoDeCompras() {
		this.carrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> listaRemocao = new ArrayList<>();
		
		if (!carrinho.isEmpty()) {
			for (Item i : carrinho) {
				if (i.getNome().equalsIgnoreCase(nome)) {
					listaRemocao.add(i);
				}
			}
			
			carrinho.removeAll(listaRemocao);			
		}
		else {
			throw new RuntimeException("A lista está vazia!");
		}
		
	}
	
	public double calcularValorTotal() {
		double soma = 0;
		
		if (!carrinho.isEmpty()) {
			for (Item i : carrinho) {
				soma += i.getPreco() * i.getQuantidade();
			}
			
			return soma;
		}
		else {
			throw new RuntimeException("A lista está vazia!");
		}
		
		
	}
	
	public void exibirItens() {
		if (!carrinho.isEmpty()) {
			System.out.println(this.carrinho);
	    } else {
	    	System.out.println("A lista está vazia!");
	    }
	}
	
	public static void main(String[] args) {
	    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

	    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
	    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
	    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
	    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

	    carrinhoDeCompras.exibirItens();

	    carrinhoDeCompras.removerItem("Lápis");

	    carrinhoDeCompras.exibirItens();

	    System.out.println("O valor total é = R$" + carrinhoDeCompras.calcularValorTotal());
	  }
	
}
