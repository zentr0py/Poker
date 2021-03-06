package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class FrenchCard extends Card 
{
    private int faceValue;
    private String suit;
    private String color;
    
    FrenchCard()
    {
        setFaceValue(-1);
        setSuit("NULL");
    }
    
    FrenchCard(int pID, int pFaceValue, String pSuit)
    {
        setID(pID);
        setFaceValue(pFaceValue);
        setSuit(pSuit);
    }
    
    void setFaceValue(int pFaceValue)
    {
        faceValue = pFaceValue;
    }
    
    int getFaceValue()
    {
        return faceValue;
    }
    
    void setSuit(String pSuit)
    {
        suit = pSuit;
        
        setColor();
    }
    
    String getSuit()
    {
        return suit;
    }
    
    String getStringFaceValue()
    {
        String retFaceString;
        
        switch(getFaceValue())
        {
            case 1: retFaceString = "Ace";      break;
            case 2: retFaceString = "Two";      break;
            case 3: retFaceString = "Three";    break;
            case 4: retFaceString = "Four";     break;
            case 5: retFaceString = "Five";     break;
            case 6: retFaceString = "Six";      break;
            case 7: retFaceString = "Seven";    break;
            case 8: retFaceString = "Eight";    break;
            case 9: retFaceString = "Nine";     break;
            case 10: retFaceString = "Ten";     break;
            case 11: retFaceString = "Jack";    break;
            case 12: retFaceString = "Queen";   break;
            case 13: retFaceString = "King";    break;
            default: retFaceString = "ERROR IN PARSING FACE VALUE";   break;
        }
        return retFaceString;            
    }
    
        
    void printCard()
    {
        System.out.println("ID:" + getID() + " " + getStringFaceValue() + " of "+ getSuit());
    }
    
    void setColor()
    {
        switch(getSuit())
        {
            case Constant.HEARTS: case Constant.DIAMONDS: color = "Red"; break;
            case Constant.CLUBS: case Constant.SPADES: color = "Black"; break;
            default: color = "ERROR IN ASSIGNING SUIT";
        }
    }
    
    String getColor()
    {
        return color;
    }    
}
