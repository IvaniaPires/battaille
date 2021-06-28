package exercice;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public Card pullTopCard() {
        return cards.get(0);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(int index) {
        cards.remove(index);
    }
}
