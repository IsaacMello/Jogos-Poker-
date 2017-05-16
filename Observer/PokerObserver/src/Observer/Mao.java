package Observer;

import Observer.CartaInterface;
import Observer.Carta;

import java.util.ArrayList;
import java.util.Observable;

public class Mao implements Observer, CartaInterface {
	
	 private StringBuilder saida;
	    private Carta precisa;
	    private int i;
	    public ArrayList<Carta> m;

	String doisDeOuro = "2 de Ouro", aDeOuro = "A de Ouro";
	String tresDePaus = "3 de Paus";
	String qDeCopas = "Q de Copas", doisDeCopas = "2 de Copas";
	String seteDeEspadas = "7 de Espadas", noveDeEspadas = "9 de Espadas", seisDeEspadas = "6 de Espadas";
	public Object mao;

	public void Ouro() {
		// TODO Auto-generated method stub
	}

	public void Paus() {

		// TODO Auto-generated method stub

	}

	public void Copas() {

		// TODO Auto-generated method stub

	}

	public void Espadas() {
		// TODO Auto-generated method stub

	}

	public void update(Observable arg0, Object arg1) {

		Carta carta = new Carta();

		String acao = String.valueOf(arg1);

		if (acao.equals(seisDeEspadas)) {
			System.out.println(seisDeEspadas);

		}

		else if (acao.equals(seteDeEspadas)) {
			System.out.println(seteDeEspadas);

		}

		else if (acao.equals(noveDeEspadas)) {
			System.out.println(noveDeEspadas);

		}

		else if (acao.equals(qDeCopas)) {
			System.out.println(qDeCopas);

		}

		else if (acao.equals(doisDeCopas)) {
			System.out.println(doisDeCopas);
		}

		else if (acao.equals(tresDePaus)) {
			System.out.println(tresDePaus);
		}

		else if (acao.equals(doisDeOuro)) {
			System.out.println(doisDeOuro);
		}
		
		else if(acao.equals(aDeOuro)){
			System.out.println(aDeOuro);
		}

	}

}
