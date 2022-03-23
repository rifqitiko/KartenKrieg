package Game;

/**
 * @author ASUS
 */
public class Side {
    private Card[][] rows;
    private int effects;
    private int row;
    private String label;
    private int[] col;
    private int[] score;
    private int tot_score;
    private int turn;
    private String s, b;
    
    public Side(String label){
        this.rows = new Card[4][10];
        this.effects = 0;
        this.label = label;
        this.col = new int[4];
        this.score = new int [4];
    }
    
    public void setTurn(int turn){
        this.turn = turn;
    }
    
    public int getTurn(){
        return turn;
    }
    
    public String getLable(){
        return label;
    }
    
    public void putCard(Card card){
        row = card.getType();
        if(col[row] > 10) return;
        rows[row][col[row]] = card;
        col[row]++;
    }
    
    public void setScore(Card card){
        row = card.getType();
        score[row] += card.getPoint();
    }
    
    public int getScore(int row){
        return score[row];
    }
    
    public void setTotScore(){
        tot_score = 0;
        for (int i=1;i<4;i++){
            tot_score += score[i];
        }
    }
    
    public int getTotScore(){
        return tot_score;
    }
    
    public void checkEvent(){
        for (int i=0;i<col[0];i++){
            effects = rows[0][i].getSubclass();
        }
        if (effects > 0 && effects < 4){
            score[effects] -= (score[effects]-col[effects]);
        } if (effects == 4){
            for (int i=0;i<4;i++){
                for (int j=0;j<col[i];j++){
                    score[i] = rows[i][j].getPoint();
                }
            }
        }
    }
    public String displaySide(int i){
        b = "";
        if (i == 0){
            for (int j=0;j<col[i];j++){
                b = ("|"+rows[i][j].getSubName()+"| ");
            }
        } else {
            for (int j=0;j<col[i];j++){
                b = b + ("|"+rows[i][j].getSubName()+":"+rows[i][j].getPoint()+"| ");
            }
        }
        return (b);
    }
    
}
