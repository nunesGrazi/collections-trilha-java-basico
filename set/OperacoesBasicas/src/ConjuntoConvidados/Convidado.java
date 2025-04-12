package ConjuntoConvidados;

public class Convidado {
	private String nome;
	private int codigoConvite;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	@Override
	public String toString() {
		return nome + ", " + codigoConvite;
	}
	
	
}
