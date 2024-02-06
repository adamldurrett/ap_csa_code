public class Tile {
    boolean flipped = false;
    public boolean isMine = false;
    boolean flagged = false;
    int nearbyMines = 0;

    public Tile(int difficulty){
        isMine = (Math.random()*difficulty)>0.75;
    }

    public void printTile(){
        if(flagged){
            System.out.print("[F]");
        }
        else if(flipped){
            if(isMine){
                System.out.print("[x]");
            }
            else{
                if(nearbyMines>0) System.out.print("["+nearbyMines+"]");
                else System.out.print("   ");
            }
        }
        else{
            System.out.print("[ ]");
        }
    }

    public void setMineCount(int mineCount){
        nearbyMines=mineCount;
    }
}
