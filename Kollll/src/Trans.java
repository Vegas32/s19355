public class Trans implements Transs {

	//Zad 3. (1,5 pkt, kol 2) Utwórz klasę reprezentującą amfibię
    public void start() {
        System.out.println("Start!");
    }
    
    public void stop() {
        System.out.println("Stop!");
    }
    
    public void tank() {
        System.out.println("Tankowanie!");
    }
    
    public void forward() {
    	System.out.println("Forward!");
    }
    
    public void back() {
    	System.out.println("Back!");
    }
    
    public void swim() {
        System.out.println("Swimming!");
    }
    

    public static void main(String[] args) {

        Trans A = new Trans();
        A.start();
    }
}