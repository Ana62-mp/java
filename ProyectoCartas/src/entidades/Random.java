package entidades;

public class Random {
	
	public static int obtenerPosicion() {
		double numRandom = Math.random()*52;
		return (int) numRandom;
	}
	
	
}
