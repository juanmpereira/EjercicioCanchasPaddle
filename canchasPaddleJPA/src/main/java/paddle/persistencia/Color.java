package paddle.persistencia;

import javax.persistence.*;

//realmente me conviene hacer una clase color solo
//por tenerla en el DER pero q no tiene nada?

@Entity
@Table(name="color")
public class Color {
		
	@Id @GeneratedValue
    private Long id;
	
	@Column(name="color_desc")
	private String descripcion;


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
