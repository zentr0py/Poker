package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class Poker 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        FrenchDeck deck = new FrenchDeck();

        deck.initialize();
        
        System.out.println("Initial Deck:");
        deck.printDeck(); 
        
        deck.shuffle();
        System.out.println("Shuffled Deck:");
        deck.printDeck();
        
        FrenchCard newcard = deck.dealCard();
        
        deck.printDeck();
        
        newcard.printCard();
    }
    
}
