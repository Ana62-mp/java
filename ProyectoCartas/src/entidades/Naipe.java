package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	//GET
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	//CONSTRUCTOR
	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		
		Palos palos = new Palos();
		
		numerosPosibles.add(new Numero("A",11));
		numerosPosibles.add(new Numero("2",2));
		numerosPosibles.add(new Numero("3",3));
		numerosPosibles.add(new Numero("4",4));
		numerosPosibles.add(new Numero("5",5));
		numerosPosibles.add(new Numero("6",6));
		numerosPosibles.add(new Numero("7",7));
		numerosPosibles.add(new Numero("8",8));
		numerosPosibles.add(new Numero("9",9));
		numerosPosibles.add(new Numero("10",10));
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));
		
		for(Numero elmNumero:numerosPosibles) {
			cartas.add(new Carta(elmNumero, palos.getCorazonRojo()));
			cartas.add(new Carta(elmNumero, palos.getCorazonNegro()));
			cartas.add(new Carta(elmNumero, palos.getDiamante()));
			cartas.add(new Carta(elmNumero, palos.getTrebol()));
			
		}
	}
	
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		for(int i=1;i<101;i++) {
			int posicion = Random.obtenerPosicion();
			Carta cartaPosicion = cartas.get(posicion);
			if(cartaPosicion.getEstado().equals("N")) {
				cartaPosicion.setEstado("C");
				auxiliar.add(cartaPosicion);
			}
		}
		for(Carta carta: cartas) {
			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
			}
		}
		
		return auxiliar;
	}
	
	
	
}
