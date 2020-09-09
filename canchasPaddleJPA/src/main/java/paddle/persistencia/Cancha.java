package paddle.persistencia;

import javax.persistence.*;

@Entity
@Table(name = "Cancha")
public class Cancha {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int tieneIluminacion;
	
	private String nombre;
	
	@ManyToOne
	private Color color;

	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTieneIluminacion() {
		return tieneIluminacion;
	}

	public void setTieneIluminacion(int tieneIluminacion) {
		this.tieneIluminacion = tieneIluminacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
