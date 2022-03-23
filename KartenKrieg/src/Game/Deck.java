package Game;

import java.util.Random;

/**
 * @author ASUS
 */
public class Deck {
    private Card[][] deck;
    private int col;
    
    public Deck(){
        this.deck = new Card[4][10];
        this.col = 0;
    }
    
    public void addCard(int label, Card card,int col){
        this.deck[label][col] = card;
            col++;
    }
    
    public void shuffle(){
        int max = 10;
        Random rand = new Random();
        for (int i=0;i<4;i++){
            for (int j=0;j<10;j++){
		int idx = rand.nextInt(max);
		Card temp = deck[i][idx];
		deck[i][idx] = deck[i][j];
		deck[i][j] = temp;
            }
        }
    }
    
    public int getRow(){
        int min = 1, max = 100;
        Random rand = new Random();
        int chance = rand.nextInt(max - min) + min;
        int row = 0;
        if (chance < 10){
            row = 0;
        } else if (chance < 20){
            row = 3;
        } else if (chance < 50){
            row = 2;
        } else if (chance < 100){
            row = 1;
        }
        return row;
    }
    
    public Card popCard(int i){
        int row = getRow();
        return deck[row][i];
    }
}
