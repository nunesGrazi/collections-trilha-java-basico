package OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	List<Pessoa> listaPessoas = new ArrayList<>();

	public OrdenacaoPessoas(List<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> listaOrdenada = new ArrayList<>(listaPessoas);
		
		if (!listaPessoas.isEmpty()) {
			Collections.sort(listaOrdenada);
		}
		
		return listaOrdenada;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> listaOrdenada = new ArrayList<>(listaPessoas);
		
		if (!listaPessoas.isEmpty()) {
			Collections.sort(listaOrdenada, new ComparatorPorAltura());
		}
		
		return listaOrdenada;
	}
	
	public static void main(String[] args) {
	    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas(null);

	    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
	    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
	    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
	    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

	    System.out.println(ordenacaoPessoas.listaPessoas);

	    System.out.println(ordenacaoPessoas.ordenarPorIdade());

	    System.out.println(ordenacaoPessoas.ordenarPorAltura());
	  }
	
}
