public class Penguin extends Animal implements Walk, Swim{

    private boolean isSwimming;
    private double swimSpeed;
    private double walkSpeed;

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public Penguin(){
        super( "Penguin" );
    }

    @Override
    public void eatingFood() {
        super.eatingFood();
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The animal: " + super.getNameOfAnimal() + " ate");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");

    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");

    }
}
