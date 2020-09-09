package paddle.persistencia;


import java.sql.*;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Partido")
public class Partido {

		@Id
		@GeneratedValue
		private int id;
		
		private Date inicio;
		
		private Date fin;
		
		@ManyToOne
		private Cancha cancha;
		
		@ManyToMany
		@JoinTable(name = "Participantes")
		private List<Jugador> jugadores;
		
		
		private Jugador reservador;


		public Partido(int id, Date inicio, Date fin, Cancha cancha, List<Jugador> jugadores, Jugador reservador) {
			super();
			this.id = id;
			this.inicio = inicio;
			this.fin = fin;
			this.cancha = cancha;
			this.jugadores = jugadores;
			this.reservador = reservador;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public Date getInicio() {
			return inicio;
		}


		public void setInicio(Date inicio) {
			this.inicio = inicio;
		}


		public Date getFin() {
			return fin;
		}


		public void setFin(Date fin) {
			this.fin = fin;
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
