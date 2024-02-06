
    public class MiniCalculator extends Calculator{
        int add(int x, int y){
            return(x+y)/2;
        }

        int add(double x, double y){
            return super.add(x,y)/2;
        }
    }