

public class NodoA {
	public Asesor asesor;
	public NodoA next;
	public Asesor tama�o;
	public NodoA head;
	
	public Asesor getAsesor() {
		return asesor;
	}
	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}
	public NodoA getNext() {
		return next;
	}
	public void setNext(Object newNode) {
		this.next = (NodoA) newNode;
	}
	public Asesor getTama�o() {
		return tama�o;
	}
	public void setTama�o(Asesor tama�o) {
		this.tama�o = tama�o;
	}
	public NodoA getHead() {
		return head;
	}
	public void setHead(NodoA head) {
		this.head = head;
	}
	public void setNext1(Object newNode) {
		// TODO Auto-generated method stub
		
	}
	

}
