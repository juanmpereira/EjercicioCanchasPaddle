package paddle.persistencia;

import javax.persistence.*;

@Entity
@Table(name="creador_paleta")
public class CreadorPaleta {
	
	@Id
	private int codigo;
	
	@Column(name="creador_nombre")
	private String nombre;
	
	@Column(name="creador_domicilio")
	private String domicilio;

	public CreadorPaleta(int codigo, String nombre, String domicilio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
