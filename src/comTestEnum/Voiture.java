package comTestEnum;

public class Voiture {
    private String marque;

    //constructeur sans paramètre
    public Voiture() {
        //Appel d'un autre constructeur
        this( "Fiat" );
    }

    //constructeur surchargé
    public Voiture(String marque) {
        //du coup toutes les constuctions passeront par ici
        this.marque = marque;
    }

    //constructeur par recopie
    public Voiture(Voiture voitureCopie) {
        this(voitureCopie.marque);
    }

    public void display(){
        System.out.println(this.marque);
    }

}
