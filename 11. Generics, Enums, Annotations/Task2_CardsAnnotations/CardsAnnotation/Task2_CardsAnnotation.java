package CardsAnnotation;

public class Task2_CardsAnnotation {

        public static void main(String[] args) {

            for (CardSuit suit : CardSuit.values()) {

                for (CardRank rank : CardRank.values()) {

                    Card card = new Card(rank, suit);
                    System.out.println(card.toString());
                }
            }
        }
    }
