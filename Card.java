
/**
 * Class card establishes all of the properties that a card can have its suit value and rank.
 *
 * @author (Milan)
 * @version (3/23/18)
 */

public class Card
{
    // instance variables - replace the example below with your own
   private int rank;//represents the rank of a card
   private int suit;//represents the suit of a card
   private int value;//represents the value of a card
   private static String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
   private static String[] suits = {"Clubs","Diamonds","Hearts","Spades"};

  Card(int suit, int values)
{
    this.rank=values;
    this.suit=suit;
}

/*
 * Returns the string version of a chosen random card in the deck.
 */
public String toString()
{
    return ranks[rank]+" of "+suits[suit];
}

/*
 * Returns the rank of a chosen random card in the deck.
 */
public int getRank()
{
    return rank;
}

/*
 * Returns the suit of a chosen random card in the deck.
 */
public int getSuit()
{
    return suit;
}

public int rankKing()
{
    return 10;
}

public int rankQueen()
{
    return 10;
}

public int rankJack()
{
    return 10;
}

/*
 * Returns the value of a chosen random card in the deck. If a jack, queen, or king the value is ten. Aces are 11 for now.(Aces can be one or eleven)
 */
public int getValue()
{
    if(rank>10)
    {
        value=10;
    }
    else if(rank==1)
    {
        value=11;
    }
    else
    {
        value=rank;
    }
    return value;
}




/*
 * Sets the value of a chosen random card in the deck.
 */
public void setValue(int set)
{
    value = set;
}
}


