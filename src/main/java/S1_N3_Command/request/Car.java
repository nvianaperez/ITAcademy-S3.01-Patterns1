package S1_N3_Command.request;

public class Car implements Vehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void switchOn() {
        System.out.println("The car "+this.name+" is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("The car "+this.name+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The car "+this.name+" is braking");
    }
}


