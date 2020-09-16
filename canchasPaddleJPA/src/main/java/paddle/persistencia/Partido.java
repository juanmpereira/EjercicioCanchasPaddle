package paddle.persistencia;


import java.sql.*;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateConverter;

@Entity
@Table(name="partido")
public class Partido {
	
		@Id @GeneratedValue
		private Long id;
		
		@Convert(converter=LocalDateConverter.class)
		@Column(name="partido_inicio")
		private LocalDate inicio;
		
		@Convert(converter=LocalDateConverter.class)
		@Column(name="partido_fin")
		private LocalDate fin;
		
		@ManyToOne
		private Cancha cancha;
		
		@ManyToMany
		@JoinTable(name = "participantes")
		private List<Jugador> jugadores;
		
		@ManyToOne
		private Jugador reservador;


		public Partido(Long id,LocalDate inicio, LocalDate fin, Cancha cancha, List<Jugador> jugadores, Jugador reservador) {
			this.id=id;
			this.inicio = inicio;
			this.fin = fin;
			this.cancha = cancha;
			this.jugadores = jugadores;
			this.reservador = reservador;
		}

		public Cancha getCancha() {
			return cancha;
		}


		public void setCancha(Cancha cancha) {
			this.cancha = cancha;
		}


		public List<Jugador> getJugadores() {
			return jugadores;
		}


		public void setJugadores(List<Jugador> jugadores) {
			this.jugadores = jugadores;
		}


		public Jugador getReservador() {
			return reservador;
		}


		public void setReservador(Jugador reservador) {
			this.reservador = reservador;
		}
		
		
		
}
