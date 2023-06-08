package S1_N3_Command.request;

public class Plane implements Vehicle {

    private String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void switchOn() {
        System.out.println("The plane "+this.name+" is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane "+this.name+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The plane "+this.name+" is braking");
    }
}

