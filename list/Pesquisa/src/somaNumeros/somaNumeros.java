package somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class somaNumeros {
	List<Integer> listaNumeros = new ArrayList<>();
	
	public somaNumeros(List<Integer> listaNumeros) {
		super();
		this.listaNumeros = listaNumeros;
	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		
		if (!listaNumeros.isEmpty()) {
			for (int i : listaNumeros) {
				soma += i;
			}
		}
		
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		
		if (!listaNumeros.isEmpty()) {
			for (int i : listaNumeros) {
				if (i >= maior) {
					maior = i;
				}
			}
		}
		
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		
		if (!listaNumeros.isEmpty()) {
			for (int i : listaNumeros) {
				if (i <= menor) {
					menor = i;
				}
			}
		}
		
		return menor;
	}
	
  public void exibirNumeros() {
    if (!listaNumeros.isEmpty()) {
    	System.out.println(this.listaNumeros);
    }
  }
  
  public static void main(String[] args) {
	    somaNumeros somaNumeros = new somaNumeros(null);

	    somaNumeros.adicionarNumero(5);
	    somaNumeros.adicionarNumero(0);
	    somaNumeros.adicionarNumero(0);
	    somaNumeros.adicionarNumero(-2);
	    somaNumeros.adicionarNumero(10);

	    System.out.println("Números adicionados:");
	    somaNumeros.exibirNumeros();

	    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

	    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

	    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
	
}
