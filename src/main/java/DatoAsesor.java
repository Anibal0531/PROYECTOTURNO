import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class DatoAsesor {
	@Column
	public Asesor serviciopresta;
	@ManyToMany
	public int size;
	@Column
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
