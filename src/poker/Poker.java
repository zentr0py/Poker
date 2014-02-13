package poker;

import java.util.Scanner;
import java.util.InputMismatchException;


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
        
        PokerHand[] hands = new PokerHand[Constant.MAX_HANDS];
        
        for(int i=0; i < Constant.MAX_HANDS; i++)
            hands[i] = new PokerHand();
        
        int numPlayers = getNumPlayers();

        deck.initialize();
        
        System.out.println("Initial Deck:");
        deck.printDeck(); 
        
        deck.shuffle();
        System.out.println("Shuffled Deck:");
        deck.printDeck();
        
        deal(hands, numPlayers, deck);
        
        System.out.println("Deck after Deal:");
        deck.printDeck();
        
        printAllHands(hands, numPlayers);
    }
    
    static void deal(PokerHand[] pHands, int pNumPlayers, FrenchDeck pDeck)
    {
        for(int card=0; card<Constant.POKER_HAND_SIZE; card++)
        {
            for(int player=0; player<pNumPlayers; player++)
            {
                pHands[player].addCard(pDeck.dealCard());
            }
        }
    }
    
    static void printAllHands(PokerHand[] pHands, int pNumPlayers)
    {
        for(int i=0; i<pNumPlayers; i++)
        {
            System.out.println("Hand #" + i + ":");
            pHands[i].printHand();
        }
 
    }
    
    static int getNumPlayers()
    {
        Scanner input = new Scanner(System.in);
        int retNumPlayers = 0;
        
        do
        {
           System.out.print("Enter number of players (2-" + Constant.MAX_HANDS + "): ");
                    
           try
           {
               retNumPlayers = input.nextInt();
           }
           catch(InputMismatchException mis)
           {
               input.next();
               System.out.println("Error reading user input. (Type Mismatch)");
           }
           catch(Exception e)
           {
               input.next();
               System.out.println("Error reading user input. (General Exception)");
           }
           
        }while(retNumPlayers < 2 || retNumPlayers >Constant.MAX_HANDS);
        
        return retNumPlayers;
    }
    
}
