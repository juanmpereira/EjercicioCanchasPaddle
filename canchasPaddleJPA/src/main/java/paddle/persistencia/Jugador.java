package paddle.persistencia;



import java.sql.*;
import java.util.List;

import javax.persistence.*;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateConverter;

@Entity
@Table(name="Jugador")
public class Jugador {
	
	@Id 
	@Column(name="jugador_id")
    private int id;

	@Column(name="jugador_nombre")
	private String nombre;
	
	@Column(name="jugador_apellido")
	private String apellido;
	
	@Column(name="jugador_direccion")
	private String direccion;
	
	@Convert(converter=LocalDateConverter.class)
	@Column(name="jugador_fecha_nacimiento")
	private Date fechaNaciemiento;

	public Jugador(int id,String nombre, String apellido, String direccion, Date fechaNaciemiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaNaciemiento = fechaNaciemiento;
		this.id=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNaciemiento() {
		return fechaNaciemiento;
	}

	public void setFechaNaciemiento(Date fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
