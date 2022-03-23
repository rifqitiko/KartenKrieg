package Game;

import java.util.Random;

/**
 * @author ASUS
 */
public class Siege extends Card{
    private int subclass;
    private int point; 
    
    public Siege(int type){
        super(type);
    }
    
    @Override
    public void chanceSubclass(){
        int max = 100;
        Random rand = new Random();
        int chance = rand.nextInt(max);
        if (chance < 30){
            this.subclass = 2;
        }else if (chance < 100){
            this.subclass = 1;
        }
    }
    
    @Override
    public int getSubclass(){
        return subclass;
    }
    
    @Override
    public void chancePoint(){
        int max = 100;
        Random rand = new Random();
        int chance = rand.nextInt(max);
        if (chance < 2){
            this.point = 10 + subclass;
        } else if (chance < 50){
            this.point = 9 + subclass;
        }else if (chance < 100){
            this.point = 8 + subclass;
        }
    }
    
    @Override
    public int getPoint(){
       return this.point;
    }
    
    @Override
    public String getSubName(){
        String subname = null;
        if(subclass == 1){
            subname = "Catapult";
        } else if (subclass == 2){
            subname = "Balista";
        }
        return subname;
    }
}
