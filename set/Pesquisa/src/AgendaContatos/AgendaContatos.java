package AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> setContato;

	public AgendaContatos() {
		this.setContato = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		setContato.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
	    if (!setContato.isEmpty()) {
	      System.out.println(setContato);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		
		if (!setContato.isEmpty()) {
			for (Contato c : setContato) {
				if (c.getNome().startsWith(nome)) {
		          contatosPorNome.add(c);
		        }
		    }
		    return contatosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
	    Contato contatoAtualizado = null;
	    if (!setContato.isEmpty()) {
	      for (Contato c : setContato) {
	        if (c.getNome().equalsIgnoreCase(nome)) {
	          c.setNumeroTelefone(novoNumero);
	          contatoAtualizado = c;
	          break;
	        }
	      }
	      return contatoAtualizado;
	    } else {
	      throw new RuntimeException("O conjunto está vazio!");
	    }
	}
	
	public static void main(String[] args) {
	    AgendaContatos agendaContatos = new AgendaContatos();

	    agendaContatos.exibirContatos();

	    agendaContatos.adicionarContato("João", 123456789);
	    agendaContatos.adicionarContato("Maria", 987654321);
	    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaContatos.adicionarContato("Ana", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Carolina", 55555555);

	    agendaContatos.exibirContatos();

	    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

	    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
	    System.out.println("Contato atualizado: " + contatoAtualizado);

	    System.out.println("Contatos na agenda após atualização:");
	    agendaContatos.exibirContatos();
	}
	
}
