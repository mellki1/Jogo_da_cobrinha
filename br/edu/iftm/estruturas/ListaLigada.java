package br.edu.iftm.estruturas;

public class ListaLigada<T> {
	private Celula<T> primeira;
	private Celula<T> ultima;
	private int totalElementos;
	
	// Metodos de Manipulando da nossa lista
	public void adicionar(T elemento) {
		adicionarNoFim(elemento);
	}
	
	public void adicionar(int posicao, T elemento) {
		if (posicao == 0) {
			adicionarNoComeco(elemento);
		}else if (posicao == totalElementos) {
			adicionarNoFim(elemento);
		}else {
			Celula<T> anterior = pegarCelula(posicao - 1);
			Celula<T> proxima = anterior.getProxima();
			Celula<T> novaCelula = new Celula<T>(anterior.getProxima(), elemento);
			novaCelula.setAnterior(anterior);
			anterior.setProxima(novaCelula);
			anterior.setAnterior(novaCelula);
			this.totalElementos++;		
		}
	}
	
	public void adicionarNoComeco(T elemento) {
				
		if (estaVazia()) {
			// esta adicionando pela primeira vez, sendo assim precisamos colocar 
			// a referencia da ultima celula tambem
			Celula<T> novaCelula = new Celula<T>(elemento);
			this.primeira = novaCelula;
			this.ultima = novaCelula;	
		} else {
			Celula<T> novaCelula = new Celula<T>(this.primeira, elemento);
			this.primeira.setAnterior(novaCelula);
			this.primeira = novaCelula;
			
		}
		totalElementos++;
	}
	
	public void adicionarNoFim(T elemento) {
		if (estaVazia()) {
			adicionarNoComeco(elemento);			
		}else {
			Celula<T> novaCelula = new Celula<T>(elemento);
			this.ultima.setProxima(novaCelula);
			novaCelula.setAnterior(this.ultima);
			this.ultima = novaCelula;
			totalElementos++;
		}
	}
	
	public T pegar(int posicao) {
		return pegarCelula(posicao).getElemento();
	} 
	
	public void remover(int posicao) {
		if (! estaOcupada(posicao)) {
			throw new IllegalArgumentException("Posico invalida");
		}
		if (posicao == 0) {
			removerDoComeco();
		}else if(posicao == this.totalElementos - 1){
			removerDoFim();
		}else {
			Celula<T> anterior = pegarCelula(posicao - 1);
			Celula<T> atual = anterior.getProxima();
			Celula<T> proxima = atual.getProxima();
			
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			
			this.totalElementos--;
		}
	}
	
	public T removerDoComeco() {
		if (!estaOcupada(0)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		Celula<T> celulaRemovida = this.primeira;
		this.primeira = this.primeira.getProxima();
		this.totalElementos--;
		
		if (estaVazia()) {
			this.ultima = null;
		}
		return celulaRemovida.getElemento();
	}
	
	public void removerDoFim() {
		if(!estaOcupada(this.totalElementos-1)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		if (totalElementos == 1) {
			removerDoComeco();
		}else {
			Celula<T> penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			totalElementos--;
		}
	}
	
	public int tamanho() {
		return this.totalElementos;
	}
	
	private Celula<T> pegarCelula(int posicao) {
		if(!estaOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		Celula<T> atual = primeira;
		for (int indice = 0; indice < posicao; indice++) {
			atual = atual.getProxima();
		}
		return atual;
	}
	
	public boolean contem(T elemento) {
		Celula<T> atual = this.primeira;
		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			
		}
		return false;
	}
	
	public String toString() {
		if (estaVazia()) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula<T> atual = primeira;
		
		for (int indice = 0; indice < totalElementos - 1; indice++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}

	public boolean estaVazia() {
		return totalElementos == 0;
	}
	
	public boolean estaOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}
	
	


}
