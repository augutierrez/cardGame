//********************************************************************
//  CardDriver.java     
//
//  Test program for Project2
//********************************************************************

public class CardDriver
{
    //-----------------------------------------------------------------
    //  Creates a deck, shuffles the deck and deals the cards.
    //-----------------------------------------------------------------
    public static void main(String args[])
    {
        DeckOfCards deck = new DeckOfCards();
        int cardNumber = 1;

        deck.shuffle();

        while (deck.hasMoreCards())
        {
            System.out.println(cardNumber + ": " + deck.deal());
            cardNumber++;
        }
    }
}
