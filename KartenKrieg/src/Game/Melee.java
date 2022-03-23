package Game;

import java.util.Random;

/**
 * @author ASUS
 */
public class Melee extends Card{
    public int subclass;
    private int point;
    
    public Melee(int type){
        super(type);
    }
    
    @Override
    public void chanceSubclass(){
        int max = 100;
        Random rand = new Random();
        int chance = rand.nextInt(max);
        if (chance < 15){
            this.subclass = 3;
        } else if (chance < 50){
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
        if (this.subclass == 1 || this.subclass == 2){
            if (chance < 20){
                this.point = 6 + subclass;
            } else if (chance < 50){
                this.point = 5 + subclass;
            }else if (chance < 100){
                this.point = 4 + subclass;
            }
        } else if (subclass == 3){
            if (chance < 20){
                this.point = 6;
            } else if (chance < 50){
                this.point = 5;
            }else if (chance < 100){
                this.point = 4;
            }
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
            subname = "Swordsman";
        } else if (subclass == 2){
            subname = "Spearman";
        } else if (subclass == 3){
            subname = "Sentry";
        }
        return subname;
    }
    
}
