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
		@Column(name="partido_id")
		private Long id;
		
		@Convert(converter=LocalDateConverter.class)
		@Column(name="partido_inicio")
		private LocalDate inicio;
		
		@Convert(converter=LocalDateConverter.class)
		@Column(name="partido_fin")
		private LocalDate fin;
		
		@ManyToOne
		@JoinColumn(name="partido_cancha")
		private Cancha cancha;
		
		@OneToMany
		@JoinColumn(name = "participante_partido")
		private List<Participacion> participantes;	
		
		@ManyToOne
		@JoinColumn(name="partido_reservador")
		private Jugador reservador;


		public Partido(Long id,LocalDate inicio, LocalDate fin, Cancha cancha, List<Participacion> participaciones, Jugador reservador) {
			this.id=id;
			this.inicio = inicio;
			this.fin = fin;
			this.cancha = cancha;
			this.reservador = reservador;
			this.participantes= participaciones;
		}

		public Cancha getCancha() {
			return cancha;
		}


		public void setCancha(Cancha cancha) {
			this.cancha = cancha;
		}

		public Jugador getReservador() {
			return reservador;
		}


		public void setReservador(Jugador reservador) {
			this.reservador = reservador;
		}

		public List<Participacion> getParticipantes() {
			return participantes;
		}

		public void setParticipantes(List<Participacion> participantes) {
			this.participantes = participantes;
		}
		
}
