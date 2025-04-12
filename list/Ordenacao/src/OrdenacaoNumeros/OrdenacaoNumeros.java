package OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Integer> numerosList;

  public OrdenacaoNumeros() {
	  this.numerosList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
	  this.numerosList.add(numero);
  }

  public List<Integer> ordenarAscendente() {
	  List<Integer> listaOrdenada = new ArrayList<>(this.numerosList);
	  
	  if (!numerosList.isEmpty()) {
		  Collections.sort(listaOrdenada);
	  }
	  
	  return listaOrdenada;
  }

  public List<Integer> ordenarDescendente() {
	  List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
    
	  if (!numerosList.isEmpty()) {
		  numerosAscendente.sort(Collections.reverseOrder());
	  }
    
	  return numerosAscendente;
  }

  public void exibirNumeros() {
	  if (!numerosList.isEmpty()) {
		  System.out.println(this.numerosList);
	  }
  }

  public static void main(String[] args) {
    OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

    listaNumeros.adicionarNumero(2);
    listaNumeros.adicionarNumero(5);
    listaNumeros.adicionarNumero(4);
    listaNumeros.adicionarNumero(1);
    listaNumeros.adicionarNumero(99);

    listaNumeros.exibirNumeros();

    System.out.println(listaNumeros.ordenarAscendente());

    listaNumeros.exibirNumeros();

    System.out.println(listaNumeros.ordenarDescendente());

    listaNumeros.exibirNumeros();
  }
}
