package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Jugadores;
import entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<String> ids;
	private ArrayList<Carta> naipeBarajado;
	
	//GET
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
	
	//CONSTRUCTORES
	public Juego( ArrayList<String> ids) {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		this.ids = ids;
		cartasJugadores = new ArrayList<>();
		for(String id:ids) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}
	

	
	public void entregarCartas(int cartasPorJugador) {
		int cartaRepartida = 0;
		for(int i=0;i<cartasPorJugador;i++) {
			for(int i1=0;i1<ids.size();i1++) {
				if(cartaRepartida<naipeBarajado.size()) {
					Carta cartaDar = naipeBarajado.get(cartaRepartida);
					cartasJugadores.get(i1).add(cartaDar);
					cartaRepartida ++;
				}else {
					System.out.println("Se agotaron cartas");
					return;
				}
			}
		}
	}
	
	
	public int devolverTotal(String idJugador) {
		int index = 0;
		int totalPuntos = 0;
		
		for(int i=0;i<ids.size();i++) {
			if(idJugador.equals(ids.get(i))) {
				index = i;
				break;
			}
		}
		
		ArrayList<Carta> cartasDelJugador = cartasJugadores.get(index);
		for(Carta carta:cartasDelJugador) {
			totalPuntos += carta.getNumero().getValor();
		}
		return totalPuntos;
	}
	
	public String determinarGanador() {
		String idGanador = ids.get(0);
		int sumaGanador = devolverTotal(idGanador);
		
		for(int i=1; i<ids.size();i++) {
			String id = ids.get(i);
			if(devolverTotal(id) > sumaGanador) {
				idGanador = id;
			}
		}
		return idGanador;
	}
	
	
	
	
	
	
}
