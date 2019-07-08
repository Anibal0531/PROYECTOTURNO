package Modelo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class AsesorVo {
	int size;
	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	@Id
	private String cedula;
	
	@Column(name="first_name",length=100)
	private String nombre;
	
	@OneToMany
    private TipoServicio servicio;
	
	@Column
    private DatoAsesor estado;
	
	@Column
    private float tiempoasesoramiento;
	
	public NodoA next;
    
    
	
   public NodoA getNext() {
		return next;
	}



	public void setNext(NodoA next) {
		this.next = next;
	}



	public TipoServicio getServicio() {
		return servicio;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



public AsesorVo getCedula() {
		return null;
	}



	public void setCedula(int cedula) {
		this.cedula = null;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setServicio(TipoServicio servicio) {
		this.servicio = servicio;
	}



	public DatoAsesor getEstado() {
		return estado;
	}



	public void setEstado(DatoAsesor estado) {
		this.estado = estado;
	}



	public float getTiempoasesoramiento() {
		return tiempoasesoramiento;
	}



	public void setTiempoasesoramiento(float tiempoasesoramiento) {
		this.tiempoasesoramiento = tiempoasesoramiento;
	}



public AsesorVo(String cedula, String nombre, TipoServicio servicio, DatoAsesor estado, float tiempoasesoramiento,
			NodoA next) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.servicio = servicio;
		this.estado = estado;
		this.tiempoasesoramiento = tiempoasesoramiento;
		this.next = next;
	}



public String insertasesor(String nombre) {
	
	String newasesor = null;
	if(this.cedula == null) {
		this.cedula = newasesor;
	}else {
		newasesor = this.nombre.toString();	
	}
	this.size = this.size+1;
	return newasesor;
   
   }

}
