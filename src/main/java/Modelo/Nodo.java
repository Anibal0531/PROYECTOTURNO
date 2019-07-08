package Modelo;

public class Nodo {
	public ListaPrioritaria lista;
	public Nodo siguiente;
	public int tamaño;
	
	public ListaPrioritaria getLista() {
		return lista;
	}
	public void setLista(ListaPrioritaria lista) {
		this.lista = lista;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public Nodo cabeza;
}
