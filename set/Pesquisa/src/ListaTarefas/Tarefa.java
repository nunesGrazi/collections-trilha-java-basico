package ListaTarefas;

public class Tarefa {
	private String descricao;
	private boolean concluida;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao + ", " + concluida;
	}
	
	
	
}
