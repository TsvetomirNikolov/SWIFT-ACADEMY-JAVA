package Deck;

public class Task1_Deck {

    public static void main(String[] args) {
        for (CardRank rank: CardRank.values()) {
            for (CardSuit suit : CardSuit.values()) {
                Card card = new Card(suit,rank);
                System.out.println(card.toString());
            }
        }
    }
}
