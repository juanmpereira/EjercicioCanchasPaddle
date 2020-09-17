package paddle.persistencia;

import javax.persistence.*;

@Entity
@Table(name="participacion")
public class Participacion {
		
	@Id @GeneratedValue
    private Long id;

	@ManyToOne
	@JoinColumn(name="participante_paleta")
	Paleta paleta;
	
	@ManyToOne
	@JoinColumn(name="participante_jugador")
	Jugador jugador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Paleta getPaleta() {
		return paleta;
	}

	public void setPaleta(Paleta paleta) {
		this.paleta = paleta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
}
