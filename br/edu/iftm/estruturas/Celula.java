package br.edu.iftm.estruturas;

public class Celula<T> {
	private Celula<T> proxima;
	private Celula<T> anterior;
	private T elemento;
	
	// Metodo construtor
	public Celula(Celula<T> proxima, T elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	// Sobrecarga do metodo constutor
	public Celula(T elemento) {
		this.proxima = null;
		this.elemento = elemento;
	}
	
	// Metodos getters e setters
	public Celula<T> getProxima() {
		return proxima;
	}

	public void setProxima(Celula<T> proxima) {
		this.proxima = proxima;
	}
	

	public Celula<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula<T> anterior) {
		this.anterior = anterior;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
}
