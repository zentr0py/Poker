package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class PokerHand 
{
    private final int handSize = Constant.POKER_HAND_SIZE;
    
    private FrenchCard[] hand;
    
    PokerHand()
    {
        hand = new FrenchCard[handSize];
        
        for(int i=0; i<handSize; i++)
        {
            hand[i] = new FrenchCard(-1, -1, "NULL");
        }
    }
    
    public void addCard(FrenchCard pCard)
    {
        int i=0;
        
        while( (i<handSize) && (hand[i].getID()!=Constant.UNINITIALIZED_ID) )
            i++;
        
        hand[i] = pCard;
    }
    
    public void printHand()
    {
        for(int i=0; i<handSize; i++)
        {
            System.out.print("Card #" + i + ": ");
            hand[i].printCard();
        }
    }
}
