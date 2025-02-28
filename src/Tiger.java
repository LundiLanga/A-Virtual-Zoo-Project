public class Tiger extends Animal implements Walk{

    private int numberOfStripes;
    private double speed;
    private int soundLevel;

    public int getNumberOfStripes() {

        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes)
    {
        this.numberOfStripes = numberOfStripes;
    }
    public double getSpeed() {

        return speed;
    }

    public void setSpeed(double speed) {

        this.speed = speed;
    }

    public int getSoundLevel() {

        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public Tiger(){

        super("Tiger");
    }

    @Override
    public void eatingCompleted() {

        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed of " + speed + "mph");
    }



}
