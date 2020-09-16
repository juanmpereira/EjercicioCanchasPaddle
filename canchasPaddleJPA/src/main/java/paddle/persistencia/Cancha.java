package paddle.persistencia;

import javax.persistence.*;

@Entity
@Table(name = "cancha")
public class Cancha {
	
	@Id @GeneratedValue
    private Long id;
	
	@Column(name="cancha_ilumniacion")
	private int tieneIluminacion;
	
	@Column(name="cancha_nombre")
	private String nombre;
	
	@ManyToOne
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
	
}
