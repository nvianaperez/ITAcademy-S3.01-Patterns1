package S1_N3_Command.request;

public class Bicycle implements Vehicle {

    private String name;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public void switchOn() {
        System.out.println("The bicycle "+this.name+" is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The bicycle "+this.name+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle "+this.name+" is braking");
    }
}

