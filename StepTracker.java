class StepTracker{
    int numSteps;
    int threshold; //10,000
    private int days = 0;
    protected int activeDays;

    public StepTracker(int n){
        threshold = n;
        numSteps = 0;
        activeDays = 0;
    }

    void addDailySteps(int x){
        if(x > threshold){
            activeDays++;
        }
        days++;
        numSteps+=x;
    }

    int activeDays(){
        return activeDays;
    }

    double averageSteps(){
        return  (double)numSteps/days;
    }

    public int getDays(){
        return days;
    }
}