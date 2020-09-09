package paddle.persistencia;

import javax.persistence.*;

//realmente me conviene hacer una clase color solo
//por tenerla en el DER pero q no tiene nada?

@Entity
@Table(name="Color")
public class Color {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String descripcion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
