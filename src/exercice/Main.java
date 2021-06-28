package exercice;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        System.out.println(player1.getName());
        Card card1 = new Card(Card.Color.SPADE, Card.Name.ACE);
        System.out.println(card1.getName() + " of " +card1.getColor()+"S" + " avec la valeur " + card1.getValue());
        System.out.println(player1.randomCard());
    }
}
