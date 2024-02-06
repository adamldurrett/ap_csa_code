public class Calculator {
    int total = 0;
    int add(int x, int y){
        return(x+y);
    }

    int add(double x, double y){
        System.out.println("HELLO");
        total += 1;
        return(int)(x+y);
    }
}
