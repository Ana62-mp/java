package test;

import entidades.Naipe;

public class Testt {

	public static void main(String[] args) {
		Naipe naipe = new Naipe();
		System.out.println(naipe.getCartas().size());
		System.out.println(naipe.barajar().size());
		
	}

}
