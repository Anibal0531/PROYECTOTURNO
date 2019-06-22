import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class RegistroAsesor {
	@Column
	public String usuario;
	@Column
	public String tiempoatendido;
	@Column
	public TipoServicio servicioprestado;
	@Column
	public ListaPrioritaria prioridad;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTiempoatendido() {
		return tiempoatendido;
	}
	public void setTiempoatendido(String tiempoatendido) {
		this.tiempoatendido = tiempoatendido;
	}
	public TipoServicio getServicioprestado() {
		return servicioprestado;
	}
	public void setServicioprestado(TipoServicio servicioprestado) {
		this.servicioprestado = servicioprestado;
	}
	public ListaPrioritaria getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(ListaPrioritaria prioridad) {
		this.prioridad = prioridad;
	}

}
