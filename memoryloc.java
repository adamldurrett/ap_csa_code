public class memoryloc {
    public static void main(String[] args){
        int x = 5;
        System.out.println(Integer.toHexString(System.identityHashCode(x)));
        x = 98;
        System.out.println(Integer.toHexString(System.identityHashCode(x)));
        
    }
}
