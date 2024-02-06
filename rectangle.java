public class rectangle{
    int width;
    int height;

    rectangle(int h, int w){
        width = w;
        height = h;
    }

    int area(){
        return height*width;
    }

    int perimeter(){
        return 2*height + 2*width;
    }

    double diagonal(){
        return Math.sqrt(height*height + width*width);
    }

    void printStepper(StepTracker step){
        System.out.println(step.activeDays);
    }
}