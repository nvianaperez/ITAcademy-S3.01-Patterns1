package S1_N3_Command.command;

import S1_N3_Command.request.Vehicle;

import java.util.List;

public class SwitchOnImpl implements IOperation {
    private List<Vehicle> vehicles;

    public SwitchOnImpl(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void execute () {
        vehicles.forEach(vehicle -> vehicle.switchOn());
    }
}

