package Deck;

public class Card implements Comparable<Card> {

    private CardSuit _colour;
    private CardRank _rank;

    public Card(CardSuit colour, CardRank rank) {
        this._colour = colour;
        this._rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this._rank.name(), this._colour.name());
    }

    @Override
    public int compareTo(Card o) {
        return 1;
    }
}
