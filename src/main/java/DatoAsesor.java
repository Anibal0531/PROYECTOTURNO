import javax.persistence.Entity;

@Entity
public class DatoAsesor {
	public Asesor serviciopresta;
	public int size;
	public boolean estadoasesor;
	public Asesor getServiciooresta() {
		return serviciopresta;
	}
	public void setServiciooresta(Asesor serviciooresta) {
		this.serviciopresta = serviciooresta;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isEstadoasesor() {
		return estadoasesor;
	}
	public void setEstadoasesor(boolean estadoasesor) {
		this.estadoasesor = estadoasesor;
	}

}
