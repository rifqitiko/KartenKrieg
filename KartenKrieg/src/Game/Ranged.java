package Game;

import java.util.Random;

/**
 * @author ASUS
 */
public class Ranged extends Card{
    private int subclass;
    private int point;
    
    public Ranged (int type){
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
            this.point = 8 + subclass;
        } else if (chance < 50){
            this.point = 7 + subclass;
        }else if (chance < 100){
            this.point = 6 + subclass;
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
            subname = "Archer";
        } else if (subclass == 2){
            subname = "Mage";
        }
        return subname;
    }
}
