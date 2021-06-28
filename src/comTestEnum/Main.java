package comTestEnum;

public class Main {
    public static void main(String [] args) {
    Voiture a = new Voiture();
    Voiture b = new Voiture("Honda"); // surchargé
    Voiture c = new Voiture(b);  //recopie
    a.display();
    b.display();
    c.display();
    Voiture d = new Voiture("Citroen");
    d.display();
    }
}
