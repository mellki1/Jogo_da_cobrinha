package br.edu.iftm.estruturas;

public class Fila<T>{
	private ListaLigada<T> lista;
	private int capacidade;
	private int tamanho;
	private int pegar;
	
	public Fila() {
		lista = new ListaLigada<T>();
	}
	
	public Fila(int capacidade) {
		lista = new ListaLigada<T>();
		this.capacidade = capacidade;
	}
	
	public void adicionar(T elemento) throws Exception {
		if(estaCheia()) {
			throw new Exception("A pilha esta cheia");
		}
		lista.adicionarNoFim(elemento);
		
	}
	
	public T remover() throws IllegalArgumentException{
		return lista.removerDoComeco();
		
	}
	
	public void limpar() {
		int tamanho = lista.tamanho();
		for(int posicao = tamanho-1; posicao >=0; posicao--) {
			lista.removerDoFim();
		}
	}

	public T olharOPrimeiro() throws IllegalArgumentException{
		return lista.pegar(0);
	}
	
	public boolean estaVazio() {
		return lista.estaVazia();
	}
	
	
	public boolean estaCheia() {	
		int tamanho = lista.tamanho();
		if (capacidade > 0) {
			return (tamanho == capacidade);
		}
		return false;
	}
	
	public String toString() {
		if (lista.estaVazia()) {
			return "A fila esta vazia";
		}
		StringBuilder builder = new StringBuilder();
		int tamanho = lista.tamanho();
		
		for (int indice = 0; indice < tamanho; indice++) {
			T elemento = lista.pegar(indice);
			builder.append(elemento.toString());
			if (indice != tamanho - 1) {
				builder.append(" << ");
			}
		}
	
		return builder.toString();
	}
	
	public T pegar(int posicao) {
		return lista.pegar(posicao);
	} 
	
	public int tamanho() {
		return lista.tamanho();
	}



}
