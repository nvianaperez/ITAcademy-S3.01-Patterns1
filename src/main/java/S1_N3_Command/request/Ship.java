package S1_N3_Command.request;

public class Ship implements Vehicle {

    private String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void switchOn() {
        System.out.println("The ship "+this.name+" is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The ship "+this.name+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The ship "+this.name+" is braking");
    }
}
