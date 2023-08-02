package ch_03;

public class q24 {
    public static void main(String[] args) {
        int rank = (int) ((Math.random() * (12 - 1 + 1)) + 1);
        int suit = (int) ((Math.random() * (4 - 1 + 1)) + 1);

        String suit_name, rank_name;

        if (suit == 1)
            suit_name = "Clubs";
        else if (suit == 2)
            suit_name = "Diamonds";
        else if (suit == 3)
            suit_name = "Hearts";
        else
            suit_name = "Spades";

        if (rank >= 2 && rank <= 10)    
            System.out.println("Your card is " + rank + " of " + suit_name);
        else {
            if (rank == 1)
                rank_name ="Ace";
            else if (rank == 11)
                rank_name = "Jack";
            else if (rank == 12)
                rank_name = "Queen";
            else
                rank_name = "King";
            
            System.out.println("Your card is " + rank_name + " of " + suit_name);
        }

    }
}
