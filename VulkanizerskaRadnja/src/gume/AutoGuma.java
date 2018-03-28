package gume;

/**
 * Klasa koja predstavlja gume
 * 
 * @author Dusan
 * @version 1.0
 *
 */
public class AutoGuma {
	/**
	 * Atribut koji predstavlja naziv marke i modela gume
	 */
	private String markaModel = null;
	
	/**
	 * Atribut koji predstavlja precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Atribut koji predstavlja sirinu gume
	 */
	private int sirina = 0;
	
	/** 
	 * Atribut koji predstavlja visinu gume
	 */
	private int visina = 0;
	
	/**
	 * Metoda koja vraca vrednost marke i modela gume
	 * @return marka i naziv gume u vidu Stringa
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Metoda koja postavlja novu vrednost za naziv marke i modela gume na osnovu unetog parametra
	 * @param markaModel je nova vrednost za naziv i model u vidu jednog Stringa
	 * @throws RuntimeException ako je unet null ili prazan String za marku i model
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	/**
	 * Vraca vrednost atributa precnik
	 * @return int vrednost precnika gume
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Metoda koja postavlja novu vrednost atributa precnik gume na osnovu unetog parametra
	 * @param precnik je nova vrednost atributa precnik i to kao int vrednost
	 * @throws RuntimeException ako je parametar van opsega tj. ako je manji od 13 i veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	
	/**
	 * Metoda koja vraca vrednost atributa sirina
	 * @return sirinu gume kao int vrednost
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Metoda koja postavlja novu vrednost za sirinu gume na osnovu unetog parametra
	 * @param sirina je nova vrednost za sirinu gume i to kao int vrednost
	 * @throws RuntimeException ako je vrednost unetog parametra manja od 135 i veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
		}
	
	/**
	 * Metoda koja vraca vrednost atributa visina 
	 * @return visina gume kao int vrednost
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Metoda koja postavlja novu vrednost za atribut visina gume na osnovu unetog parametra
	 * @param visina je nova vrednost za visinu gume i to kao int vrednost
	 * @throws RuntimeException ako je vrednost unetog parametra manja od 25 i veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}

	/**
	 * Redefinisana metoda koja vraca vrednosti svih atributa gume - marka i model, precnik, sirina i visina
	 * @return informacije o gumi kao String vrednost
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	/**
	 * Redefinisana metoda koja proverava da li su uneti objekti isti
	 * @return true - ako su objekti isti ili false - ako objekti nisu isti
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
	} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

	
}
