package Modelo;

public class Nodo {
	public ListaPrioritaria lista;
	public Nodo siguiente;
	public int tama�o;
	
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
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public Nodo cabeza;
}
