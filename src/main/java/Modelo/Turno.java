package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turno {
	@Id
	public int cedula;
	@OneToMany
	public int tiempollegada;
	@Column
	public int fecha;
	@Column
	public int tiposervicio;
	@Column
	public int tipoprioridad;
	private Object head;
	private Object tail;
	public String next;
	public String preview;
	@Column
	public String size;
	
	public Object getHead() {
		return head;
	}
	public void setHead(Object head) {
		this.head = head;
	}
	public Object getTail() {
		return tail;
	}
	public void setTail(Object tail) {
		this.tail = tail;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getTiempollegada() {
		return tiempollegada;
	}
	public void setTiempollegada(int tiempollegada) {
		this.tiempollegada = tiempollegada;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public int getTiposervicio() {
		return tiposervicio;
	}
	public void setTiposervicio(int tiposervicio) {
		this.tiposervicio = tiposervicio;
	}
	public int getTipoprioridad() {
		return tipoprioridad;
	}
	public void setTipoprioridad(int tipoprioridad) {
		this.tipoprioridad = tipoprioridad;
	}
   
	
}
