package S1_N3_Command.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<IOperation> operations;

    public Invoker() {
        this.operations = new ArrayList<>();
    }

    public void addOperations (IOperation operation) {
        this.operations.add(operation);
    }

    public void makeOperations () {
        this.operations.forEach(IOperation -> IOperation.execute());
        this.operations.clear();
    }


}
