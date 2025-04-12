package listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> listaTarefa;

	public ListaTarefas() {
		this.listaTarefa = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		
		List<Tarefa> tarefaRemocao = new ArrayList<>();
		
		for (Tarefa t : listaTarefa) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaRemocao.add(t);
			}
		}
		
		listaTarefa.removeAll(tarefaRemocao);
		
	}
	
	public int obterNumeroTotalTarefas() {
		return listaTarefa.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaTarefa);
	}
	
	public static void main(String[] args) {
		 
		ListaTarefas listaTarefa = new ListaTarefas();
		System.out.println("O numero total da lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa a");
		listaTarefa.adicionarTarefa("Tarefa a");
		listaTarefa.adicionarTarefa("Tarefa b");
		System.out.println("O numero total da lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa a");
		System.out.println("O numero total da lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa a");
		listaTarefa.adicionarTarefa("Tarefa a");
		
		listaTarefa.obterDescricoesTarefas();
		
	}
	
}
