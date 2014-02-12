/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class FrenchDeck 
{
   
    final int deckSize = Constant.DECK_SIZE;
    FrenchCard[] deck;
    
    FrenchDeck()
    {
        deck = new FrenchCard[deckSize];
        
        //populate the empty deck with faceValue and suit data
        for(int i=0; i<deckSize; i++)
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
                default: deck[i].setSuit("ERROR"); break;
            }
        }
    }
    
    //print cards
    void printDeck()
    {
        for(int i=0; i<deckSize; i++)
        {
            System.out.println("ID:" + deck[i].getID() + " ");
            deck[i].print();
        }
    }
}
