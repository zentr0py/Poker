package poker;

import java.lang.reflect.Array;
import java.util.Random;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class FrenchDeck 
{
   
    private final int fullDeckSize = Constant.FRENCH_DECK_SIZE;
    private int currentDeckSize;
    private FrenchCard[] deck;
    
    FrenchDeck()
    {
        deck = new FrenchCard[fullDeckSize];
     
        setCurrentDeckSize(0);
    }
    
    public void initialize()
    {
        //populate the empty deck with faceValue and suit data
        for(int i=0; i<fullDeckSize; i++)
        {
            deck[i] = new FrenchCard();
            
            deck[i].setID(i);
            
            deck[i].setFaceValue((i % 13) + 1);
            
            int currentQuarter = i / 13; //each quarter of the deck is a suit..
                                        //there are 13 cards per suit
            switch(currentQuarter)
            {
                case 0: deck[i].setSuit(Constant.HEARTS); break;
                case 1: deck[i].setSuit(Constant.DIAMONDS); break;
                case 2: deck[i].setSuit(Constant.CLUBS); break;
                case 3: deck[i].setSuit(Constant.SPADES); break;
                default: deck[i].setSuit("ERROR IN ASSIGNING SUIT"); break;
            }
            
            incCurrentDeckSize();
        }
    }
    
    
    //print cards
    public void printDeck()
    {
        for(int i=0; i<getCurrentDeckSize(); i++)
        {
            System.out.print("[" + i + "] ");
            deck[i].printCard();
        }
    }
    
    private void setCurrentDeckSize(int pSize)
    {
        currentDeckSize=pSize;
    }
    
    private int getCurrentDeckSize()
    {
        return currentDeckSize;
    }
    
    private void incCurrentDeckSize()
    {
        setCurrentDeckSize(getCurrentDeckSize() + 1);
    }
    
    private void decCurrentDeckSize()
    {
        setCurrentDeckSize(getCurrentDeckSize() - 1);
    }
    
    private void swapCards(FrenchCard pCard1, FrenchCard pCard2, int pIndex1, int pIndex2)
    {
        FrenchCard tempCard = pCard1;
                
        Array.set(deck, pIndex1, pCard2);
        Array.set(deck, pIndex2, tempCard);        
    }
    
    public void shuffle()
    {
        Random randgen = new Random(System.currentTimeMillis());
        
        int rand;
        
        for(int i=0; i<getCurrentDeckSize(); i++)
        {
            rand = randgen.nextInt(getCurrentDeckSize());
            
            swapCards(deck[i], deck[rand], i, rand);
        }
    }
    
    //returns card from "top" of deck (highest index)
    //...then decrements dec size
    public FrenchCard dealCard()
    {
        FrenchCard retCard = deck[getCurrentDeckSize()-1];
     
        deck[getCurrentDeckSize()-1] = new FrenchCard();
        
        decCurrentDeckSize();
        
        return retCard;
    }
}
