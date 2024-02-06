import java.util.ArrayList;
import java.util.Random;

// to compile:  javac filename.java
// to run:      java mainClassName
class Main{
    public static void main(String[] args){ 
        MinecraftPlayer steve = new MinecraftPlayer("Joe");
        int x = steve.damage(5);
        System.out.println(steve.getHealth());

    }
    
    public static int squared(int c){
        return c*c;
    }
}
