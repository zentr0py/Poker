package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class Card 
{
    private int ID;
    private int faceValue;
    private String suit;
    private String color;
    
    Card()
    {
        setID(-1);
        setFaceValue(-1);
        setSuit("NULL");
    }
    
    Card(int pID, int pFaceValue, String pSuit)
    {
        setID(pID);
        setFaceValue(pFaceValue);
        setSuit(pSuit);
    }
    
    void setID(int pID)
    {
        ID = pID;
    }
    
    int getID()
    {
        return ID;
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
        
        String tempColor;
        
        switch(suit)
        {
            case Constant.HEARTS: case Constant.DIAMONDS: tempColor = "Red"; break;
            case Constant.CLUBS: case Constant.SPADES: tempColor = "Black"; break;
            default: tempColor = "ERROR";
        }
        
        setColor(tempColor);
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
            default: retFaceString = "ERROR";   break;
        }
        return retFaceString;            
    }
    
    void printCard()
    {
        System.out.println(getStringFaceValue() + " of " + getSuit());
    }
    
    void setColor(String pColor)
    {
        color = pColor;
    }
    
    String getColor()
    {
        return color;
    }
    
}
