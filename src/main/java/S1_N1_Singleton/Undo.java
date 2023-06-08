package S1_N1_Singleton;
import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static List<String> commands;

    //    Declaration
    public static Undo instance;

    //    Private constructor to avoid creating an instance by new operator
    private Undo() {
        this.commands = new ArrayList<String>();
    }

    //    Get the SAME instance towards the method getInstance(). Static to access with Class.method
    public static Undo getInstance() {
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    //    Methods
    public List<String> addCommand(String command) {
        commands.add(command);
        return commands;
    }

    public void deleteCommand(String c) {
        for (String command : commands) {
            if(command.equals(c)) {
                commands.remove(c);
            }
        }
    }

    public void showCommands() {
        commands.forEach(System.out::println);
    }

    public void undoLastCommand() {
        if(commands.size() != 0) {
            commands.remove(commands.size()-1);
        } else {
            System.out.println("There are not commands to do 'undo'");
        }

    }
}
