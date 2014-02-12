package poker;

/**
 *
 * @author Tim Field <field.tim.k@gmail.com>
 */
public class Card 
{
    private int ID;

    
    Card()
    {
        setID(-1);
    }
    
    Card(int pID, int pFaceValue, String pSuit)
    {
        setID(pID);
    }
    
    void setID(int pID)
    {
        ID = pID;
    }
    
    int getID()
    {
        return ID;
    }
}
