package Modelo;


public class NodoA {
	public AsesorVo asesor;
	public NodoA next;
	public AsesorVo tama�o;
	public NodoA head;
	
	public AsesorVo getAsesor() {
		return asesor;
	}
	public void setAsesor(AsesorVo asesor) {
		this.asesor = asesor;
	}
	public NodoA getNext() {
		return next;
	}
	public void setNext(Object newNode) {
		this.next = (NodoA) newNode;
	}
	public AsesorVo getTama�o() {
		return tama�o;
	}
	public void setTama�o(AsesorVo tama�o) {
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
