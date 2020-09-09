package paddle.persistencia;

import java.lang.reflect.Constructor;

import javax.persistence.*;

@Entity
@Table(name="Paleta")
public class Paleta {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private Color color;
	
	@ManyToOne
	private Constructor constructor;
	
	private String nombre;
	
	private double grosor;
	

	public Paleta(int id, Color color, Constructor constructor, String nombre, double grosor) {
		super();
		this.id = id;
		this.color = color;
		this.constructor = constructor;
		this.nombre = nombre;
		this.grosor = grosor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Constructor getConstructor() {
		return constructor;
	}

	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}
	
	
	
}
