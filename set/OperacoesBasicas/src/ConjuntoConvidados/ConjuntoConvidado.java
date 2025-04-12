package ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
	private Set<Convidado> setConvidado;

	public ConjuntoConvidado(Set<Convidado> setConvidado) {
		this.setConvidado = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		setConvidado.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		
		Convidado convidado = null;
		
		for (Convidado c : setConvidado) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidado = c;
				break;
			}
		}
		
		setConvidado.remove(convidado);
		
	}
	
	public int contarConvidados() {
		return setConvidado.size();
	}
	
	public void exibirConvidados() {
		System.out.println(setConvidado);
	}
 	
	public static void main(String[] args) {
	    ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado(null);

	    System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

	    conjuntoConvidado.adicionarConvidado("Alice", 1234);
	    conjuntoConvidado.adicionarConvidado("Bob", 1235);
	    conjuntoConvidado.adicionarConvidado("Charlie", 1235);
	    conjuntoConvidado.adicionarConvidado("David", 1236);

	    System.out.println("Convidados no conjunto:");
	    conjuntoConvidado.exibirConvidados();

	    System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

	    conjuntoConvidado.removerConvidadoPorCodigoConvite(1236);
	    System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

	    System.out.println("Convidados no conjunto após a remoção:");
	    conjuntoConvidado.exibirConvidados();
	  }
	
}
