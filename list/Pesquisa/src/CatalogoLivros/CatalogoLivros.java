package CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	List<Livro> catalogo = new ArrayList<>();

	public CatalogoLivros(List<Livro> catalogo) {
		this.catalogo = catalogo;
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogo.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosAutor = new ArrayList<>();
		
		if (!catalogo.isEmpty()) {
			for (Livro l : catalogo) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosAutor.add(l);
				}
			}
		}
		
		return livrosAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosIntervaloAnos = new ArrayList<>();
		
		if (!catalogo.isEmpty()) {
			for (Livro l : catalogo) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosIntervaloAnos.add(l);
				}
			}
		}
		
		return livrosIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livro = null;
		
		if (!catalogo.isEmpty()) {
			for (Livro l : catalogo) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livro = l;
					break;
				}
			}
		}
		
		return livro;
	}
	
	public static void main(String[] args) {
	    CatalogoLivros catalogo = new CatalogoLivros(null);

	    catalogo.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    catalogo.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
	    catalogo.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

	    System.out.println(catalogo.pesquisarPorAutor("Robert C. Martin"));

	    System.out.println(catalogo.pesquisarPorAutor("Autor Inexistente"));

	    System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2022));

	    System.out.println(catalogo.pesquisarPorIntervaloAnos(2025, 2030));

	    System.out.println(catalogo.pesquisarPorTitulo("Java Guia do Programador"));

	    System.out.println(catalogo.pesquisarPorTitulo("Título Inexistente"));
	  }
	
}
