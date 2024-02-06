public class Workbench {
    
    public static void main(String[] args){
        int [][] myarray =  {{2,4,5,6},
                             {1,2,3,4},
                             {7,8,1,2},
                             {6,3,7,6}};

        for(int i = 0; i < myarray.length; i++){
            for(int j = 0; j < myarray[i].length; j++){
                System.out.print(myarray[j][i]);
            }
        }
        System.out.println();

    }
}
