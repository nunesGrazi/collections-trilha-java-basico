package ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

import ConjuntoConvidados.Convidado;

public class ConjuntoPalavrasUnicas {
	private Set<String> setPalavra;

	public ConjuntoPalavrasUnicas(Set<String> setPalavra) {
		this.setPalavra = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		setPalavra.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		
		for (String s : setPalavra) {
			if (setPalavra.contains(s)) {
				setPalavra.remove(palavra);
				break;
			}
		}
			
	}
	
	public boolean verificarPalavra(String palavra) {
	    return setPalavra.contains(palavra);
	}
	
	 public void exibirPalavrasUnicas() {
		 System.out.println(setPalavra);
	 }
	 
	 public static void main(String[] args) {
	    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas(null);

	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    conjuntoLinguagens.exibirPalavrasUnicas();

	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    conjuntoLinguagens.removerPalavra("Swift");

	    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
	    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

	    conjuntoLinguagens.exibirPalavrasUnicas();
	  }
}
