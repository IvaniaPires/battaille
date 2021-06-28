package exercice;
import java.util.Random;

public class Player {
    /** atributs **/
    private String name;
    private Deck deck;

    //public Player (){
      //  this("Jonh");
    //}

    public Player(String name) {
        this.name = name;
    }

   // public Player(Player playerCopie) {
     //   this(playerCopie.name);
   // }


    /** méthodes **/
    public Card pullCard() {
        return deck.pullTopCard();
    }

    public void initCards(int nbCardsInDeck) {

    }

    public Card.Name randomCard() {
        int pick = new Random().nextInt(Card.Name.values().length);
        return Card.Name.values()[pick];
    }

    /** getters and setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }


}

