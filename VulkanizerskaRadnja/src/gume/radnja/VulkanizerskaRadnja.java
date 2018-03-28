package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa za Vulkanizersku radnju
 * @author Dusan
 * @version 1.0
 */
public class VulkanizerskaRadnja {
	
	/** 
	 * Lista guma u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Metoda koja dodaje novu gumu u listu guma u radnji
	 * @param a predstavlja novu gumu koja se dodaje na pocetak liste
	 * @throws NullPointerException ako je vrednost parametra null
	 * @throws RuntimeException ako guma vec postoji u listi guma u radnji
	 */
	public void dodajGumu(AutoGuma a) {
			if (a == null)
				throw new NullPointerException("Guma ne sme biti null");
			
			if (gume.contains(a))
				throw new RuntimeException("Guma vec postoji");
			
			gume.addFirst(a);
	}
	
	/**
	 * Metoda koja pronalazi i vraca listu guma trazene marke i modela
	 * @param markaModel naziv marke i modela gume
	 * @return null ako je naziv marke i modela null vrednost, a ako to nije slucaj
	 * 			vratiti listu guma te marke i modela
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
			if (markaModel == null)
				return null;
			
			LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
			
			for(int i=0;i<gume.size();i++)
				if (gume.get(i).equals(markaModel))
					novaLista.add(gume.get(i));
			
			return novaLista;
	}

	
}
