package Game;

/**
 * @author ASUS
 */
public class Hand {
    private Card[] hand;
    private String player;
    private int win_count;
    private int col;
    
    public Hand(String player){         
        this.player = player;
        this.win_count = 0;
        hand = new Card[11];
        this.col = 10;
    }
    
    public Card takeCard(int i){
        Card put = null;
        put = hand[i];
        hand = Shift(hand, i); 
        col--;
        return put;
    }
    
    public Card[] Shift(Card[] hand, int i){
        for (int j=i;j<col;j++){
            hand[j] = hand[j+1];
        }
        return hand;
    }
    
    public void setHand(Card card, int i){
            this.hand[i] = card;
    }
    
    public Card getHand(int i){
        return hand[i];
    }
}
