package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class Deck 
{
    final int deckSize = Constant.DECK_SIZE;
    
    Deck()
    {
        Card[] deck = new Card[deckSize];
        
        //populate the empty deck with faceValue and suit data
        for(int i=0; i<deckSize; i++)
        {
            deck[i] = new Card();
            
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
                default: deck[i].setSuit("ERROR"); break;
            }
        }
        
        //print cards
        for(int i=0; i<deckSize; i++)
            deck[i].printCard();
 
    }
}
