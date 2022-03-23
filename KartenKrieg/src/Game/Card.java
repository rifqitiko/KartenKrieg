package Game;

/**
 * @author 
 */
public abstract class Card {
    private int c_type;
    private String c_name;
    
    public Card(int c_type){
        this.c_type = c_type;
        this.c_name = getName();
    }
    
    public void setc_Class(int c_type){
        this.c_type = c_type;
        this.c_name = getName();
    }
    
    public String getName(){
        if(c_type == 0){
            c_name = "Event";
        } else if (c_type == 1){
            c_name = "Melee";
        } else if (c_type == 2){
            c_name = "Ranged";
        } else if (c_type == 3){
            c_name = "Siege";
        }
        return c_name;
    }
    
    public int getType(){
        return c_type;
    }
    
    public abstract void chanceSubclass();
    
    public abstract void chancePoint();
    
    public abstract int getSubclass();
    
    public abstract String getSubName();
    
    public abstract int getPoint();
}
