public class Grid {
    Tile[][] tileGrid;
    int size = 0;

    public Grid(int size, int difficulty){
        this.size = size;
        tileGrid = new Tile[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                tileGrid[i][j] = new Tile(difficulty);
            }
        }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                tileGrid[i][j].setMineCount(determineNearbyMines(i, j));
            }
        }

        printGrid();
    }

    public void printGrid(){
        System.out.print(" ");
        for(int i = 0; i < size; i++){
            System.out.print("  " + i);
        }
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print(i + " ");
            for(int j = 0; j < size; j++){
                tileGrid[i][j].printTile();
            }
            System.out.println();
        }
    }

    public int determineNearbyMines(int x, int y){
        int count = 0;
        int startX = x-1;
        int startY = y-1;
        int endX = x+1;
        int endY = y+1;

        if(startX<0) startX = 0;
        if(startY<0) startY = 0;
        if(endX>=size) endX = size-1;
        if(endY>=size) endY = size-1;

        for(int i = startX; i<=endX; i++){
            for(int j = startY; j<=endY; j++){
                if(tileGrid[i][j].isMine) count++;
            }
        }
        return count;
    }
}
