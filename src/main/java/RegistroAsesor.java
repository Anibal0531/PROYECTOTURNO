

public class RegistroAsesor {
	public String usuario;
	public String tiempoatendido;
	public TipoServicio servicioprestado;
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
