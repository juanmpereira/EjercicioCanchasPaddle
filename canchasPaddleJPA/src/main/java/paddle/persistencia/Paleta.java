package paddle.persistencia;

import java.lang.reflect.Constructor;

import javax.persistence.*;

@Entity
@Table(name="paleta")
public class Paleta {
	
	@Id 
	@Column(name="paleta_codigo")
    private int codigo;
	
	@ManyToOne
	@JoinColumn(name="paleta_color")
	private Color color;
	
	@ManyToOne
	@JoinColumn(name="paleta_constructor")
	private CreadorPaleta constructor;
	
	@Column(name="paleta_nombre")
	private String nombre;
	
	@Column(name="paleta_grosor")
	private double grosor;
	

	public Paleta(int codigo, Color color, CreadorPaleta constructor, String nombre, double grosor) {
		this.codigo=codigo;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public CreadorPaleta getConstructor() {
		return constructor;
	}

	public void setConstructor(CreadorPaleta constructor) {
		this.constructor = constructor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
