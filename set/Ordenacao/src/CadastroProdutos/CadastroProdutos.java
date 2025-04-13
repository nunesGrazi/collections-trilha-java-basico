package CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> setProdutos;

	public CadastroProdutos() {
		this.setProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
	    setProdutos.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
	    Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
	    if (!setProdutos.isEmpty()) {
	    	return produtosPorNome;
	    } else {
	      throw new RuntimeException("O conjunto está vazio!");
	    }
	}

	public Set<Produto> exibirProdutosPorPreco() {
	    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
	    if (!setProdutos.isEmpty()) {
	    	produtosPorPreco.addAll(setProdutos);
	    	return produtosPorPreco;
	    } else {
	    	throw new RuntimeException("O conjunto está vazio!");
	    }
	}
	
	public static void main(String[] args) {
	    CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

	    System.out.println(cadastroProdutos.setProdutos);

	    System.out.println(cadastroProdutos.exibirProdutosPorNome());

	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
	
}
