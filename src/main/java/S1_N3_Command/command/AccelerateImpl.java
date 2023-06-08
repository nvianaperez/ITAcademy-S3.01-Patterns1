package S1_N3_Command.command;

import S1_N3_Command.request.Vehicle;

import java.util.List;

public class AccelerateImpl implements IOperation {

    private List<Vehicle> vehicles;

    public AccelerateImpl(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public void execute() {
        vehicles.forEach(vehicles -> vehicles.accelerate());
    }
}
