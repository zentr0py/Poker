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
        setID(Constant.UNINITIALIZED_ID);
    }
    
    Card(int pID)
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
