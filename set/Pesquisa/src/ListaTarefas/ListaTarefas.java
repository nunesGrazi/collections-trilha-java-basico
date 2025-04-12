package ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> setTarefa;

	public ListaTarefas() {
		this.setTarefa = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		setTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		
		if (!setTarefa.isEmpty()) {
			for (Tarefa t: setTarefa) {
				if (setTarefa.contains(t)) {
					setTarefa.remove(t);	
					break;
				}
			}
		}
		
	}
	
	public void exibirTarefas() {
		
		if (!setTarefa.isEmpty()) {
			for (Tarefa t : setTarefa) {
				System.out.println(t);
			}
		}
		
	}
	
	public int contarTarefas() {
		return setTarefa.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		
		Set<Tarefa> setTarefasConcluidas = new HashSet<>();
		
		if (!setTarefa.isEmpty()) {
			for (Tarefa t : setTarefa) {
				if (t.isConcluida()) {
					setTarefasConcluidas.add(t);
				}
			}
		}
		
		return setTarefasConcluidas;
		
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		
		Set<Tarefa> setTarefasPendentes = new HashSet<>();
		
		if (!setTarefa.isEmpty()) {
			for (Tarefa t : setTarefa) {
				if (!t.isConcluida()) {
					setTarefasPendentes.add(t);
				}
			}
		}
		
		return setTarefasPendentes;
		
	}
	
	public void marcarTarefaConcluida(String descricao) {
		
		for (Tarefa t : setTarefa) {
	      if (t.getDescricao().equalsIgnoreCase(descricao)) {
	        t.setConcluida(true);
	      }
	    }
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		
		for (Tarefa t : setTarefa) {
	      if (t.getDescricao().equalsIgnoreCase(descricao)) {
	        t.setConcluida(false);
	      }
	    }
		
	}
	
	public void limparListaTarefas() {
		
	    if (setTarefa.isEmpty()) {
	    	System.out.println("A lista já está vazia!");
	    } else {
	    	setTarefa.clear();
	    }
	    
	}

	public static void main(String[] args) {
	    ListaTarefas listaTarefas = new ListaTarefas();
	
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");
	
	    listaTarefas.exibirTarefas();
	
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();
	
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
	
	    System.out.println(listaTarefas.obterTarefasPendentes());
	
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");
	
	    System.out.println(listaTarefas.obterTarefasConcluidas());
	
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();
	
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	}
}
