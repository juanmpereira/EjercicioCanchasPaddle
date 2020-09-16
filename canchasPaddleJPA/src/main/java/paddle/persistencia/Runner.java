package paddle.persistencia;


import org.uqbarproject.jpa.java8.extras.*;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;


public class Runner implements WithGlobalEntityManager,TransactionalOps{
	
	public static void main(String[] args){
		new Runner().run();
	}

	private void run() {
		entityManager();
		createEntities();
	}

	private void createEntities() {
	 Color rojo = new Color();
	 rojo.setDescripcion("rojo");
	 
	 Cancha cancha1 = new Cancha();
	 cancha1.setColor(rojo);
	 cancha1.setNombre("cancha pro");
	 cancha1.setTieneIluminacion(0);
	 
	 entityManager().persist(cancha1);
	}

}
