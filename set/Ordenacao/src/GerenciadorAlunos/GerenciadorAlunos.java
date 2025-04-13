package GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> setAlunos;

	public GerenciadorAlunos() {
		this.setAlunos = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		setAlunos.add(new Aluno(nome, matricula, media));
	}					
	
	public void removerAlunoPorMatricula(long matricula) {
	    Aluno aluno = null;
	    if (!setAlunos.isEmpty()) {
	    	for (Aluno a : setAlunos) {
	    		if (a.getMatricula() == matricula) {
	    			aluno = a;
	    			break;
	    		}
	    	}
	    	setAlunos.remove(aluno);
	    } else {
	    	throw new RuntimeException("O conjunto está vazio!");
	    }

	    if (aluno == null) {
	    	System.out.println("Matricula não encontrada!");
	    }
	 }
	
	 public Set<Aluno> exibirAlunosPorNome() {
	    Set<Aluno> setAlunosPorNome = new TreeSet<>(setAlunos);
	    if (!setAlunos.isEmpty()) {
	    	return setAlunosPorNome;
	    } else {
	      throw new RuntimeException("O conjunto está vazio!");
	    }
	 }
	 
	 public void exibirAlunosPorNota() {
	    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
	    if (!setAlunos.isEmpty()) {
	    	alunosPorNota.addAll(setAlunos);
	    	System.out.println(alunosPorNota);
	    } else {
	    	System.out.println("O conjunto está vazio!");
	    }
	 }
	 
	 public static void main(String[] args) {
	    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

	    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

	    System.out.println("Alunos no gerenciador:");
	    System.out.println(gerenciadorAlunos.setAlunos);

	    gerenciadorAlunos.removerAlunoPorMatricula(000L);
	    gerenciadorAlunos.removerAlunoPorMatricula(123457L);
	    System.out.println(gerenciadorAlunos.setAlunos);

	    gerenciadorAlunos.exibirAlunosPorNome();

	    gerenciadorAlunos.exibirAlunosPorNota();
	  }
}
