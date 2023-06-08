package S1_N3_Command;

import S1_N3_Command.command.*;
import S1_N3_Command.request.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Bicycle("BICI"),
                new Car("COCHE"),
                new Plane("AVION"),
                new Ship("BARCO")
        );

        List<IOperation> operationList = List.of(
                new SwitchOnImpl(vehicles),
                new AccelerateImpl(vehicles),
                new BrakeImpl(vehicles)
        );
        Invoker ivk = new Invoker();
        operationList.forEach(operation -> ivk.addOperations(operation));
        ivk.makeOperations();

    }
}

