import java.util.ArrayList;
import com.sun.tools.javac.util.List;


public class Police {
	
	// Zad 4. Stwórzklasę Policeman reprezentującą policjanta.
	 private String imie;
     private String nazwisko;
     private String email;
     private String haslo;
     private String typP;

     
     public Police (String imie, String nazwisko, String email,String haslo) {

         this.imie = imie;
         this.nazwisko = nazwisko;
         this.email = email;
         this.haslo = haslo;
         this.typP = "Aktywny";
     }
     
     //Aktywowanie i deaktywowanie policjanta.
     public void ChangeTyp (String imie, String nazwisko, String email,String haslo) {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.email = email;
         this.haslo = haslo;
         this.typP = "Pasywny";
     }
     
     //Wyświetlenie wszystkich informacji dot. policjanta.
     public String getALL() {
         return imie;
         return nazwisko;
         return email;
         return haslo;
         return typP;
     }
     
     
     
     //Nieudana próba umieszczenia na liście.
     private static List instances = new ArrayList();

     public static Police createMyObject() {
     Police o = new Police();
     instances.add(new java.lang.ref.WeakReference(o));
     return o;
     }

     public static List getInstances() {
     return instances;
     }

     private Police() {
     }
     
     
     
     
}
