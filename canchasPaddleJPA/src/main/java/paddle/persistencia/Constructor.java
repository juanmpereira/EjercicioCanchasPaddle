package paddle.persistencia;

import javax.persistence.*;

@Entity
@Table(name="Constructor")
public class Constructor {
		
	private int codigo;
	
	private String nombre;
	
	private String domicilio;

	public Constructor(int codigo, String nombre, String domicilio) {
		super();
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
