public class Person {
    double height;
    String name;
    int age;
    String hairColor;

    Person(double h, int a, String n, String hC){
        height = h;
        hairColor = hC;
        name = n;
        age = a;
    }

    void printInfo(){
        System.out.println("Guest Name: " + name + ", Height: " + height + ", Age: " + age + ", Hair Color: " + hairColor);
    }
    
}
