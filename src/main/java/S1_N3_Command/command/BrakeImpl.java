package S1_N3_Command.command;

import S1_N3_Command.request.Vehicle;

import java.util.List;

public class BrakeImpl implements IOperation{

    private List<Vehicle> vehicles;

    public BrakeImpl(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public void execute() {
        vehicles.forEach( vehicle -> vehicle.brake());
    }
}
