package Game;

import java.util.Random;

/**
 * @author ASUS
 */
public class Event extends Card{
    private int subclass;
    private int point;
    
    public Event(int type){
        super(type);
    }
    @Override
    public void chanceSubclass(){
        int max = 100;
        Random rand = new Random();
        int chance = rand.nextInt(max);
        if (chance < 30){
            this.subclass = 3;
        }else if (chance < 50){
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
    public String getSubName(){
        String subname = null;
        if(subclass == 1){
            subname = "Snow";
        }else if (subclass == 2){
            subname = "Fog";
        }else if (subclass == 3){
            subname = "Storm";
        }
        return subname;
    }
    
    @Override
    public void chancePoint(){
        this.point = 0;
    }
    
    @Override
    public int getPoint(){
       return point;
    }
}
