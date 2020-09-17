package paddle.persistencia;

import javax.persistence.*;

@Entity
@Table(name = "cancha")
public class Cancha {
	
	@Id 
	@Column(name="cancha_id")
    private int id;
	
	@Column(name="cancha_ilumniacion")
	private int tieneIluminacion;
	
	@Column(name="cancha_nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="cancha_color") //MIRAR SI IRIA ACA O EN COLOR O COMO HACER
	private Color color;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
