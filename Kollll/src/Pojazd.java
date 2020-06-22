//Zadanie 2 i zadanie 3 połączyłem 
//2. Stwórz klasę abstrakcyjną reprezentującą pojazd.

public class Pojazd implements Pojazdd {
	
	String kolor;
    String marka;
    int pojemnoscSilnika;
    int liczbaMiejsc;
    boolean activity;

    public Pojazd (String kolor, String marka, int pojemnoscSilnika, int liczbaMiejsc) {
        this.kolor = kolor;
        this.marka = marka;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.liczbaMiejsc = liczbaMiejsc;;
        }
    
    public void ON(String kolor, String marka) {
    	this.kolor=kolor;
    	this.marka=marka;
    	activity=true;
        System.out.println("Uruchomienie silnika!");
        
    }
    
    public void OFF(String kolor, String marka) {
    	this.kolor=kolor;
    	this.marka=marka;
    	activity=false;
        System.out.println("Wyłączenie silnika!");
    }

}
