package S1_N1_Singleton;

public class Main {

    public static void main(String[] args) {
//        Undo newInstance = new Undo(); // create instance with 'new' is forbidden because of private constructor
        Undo u = Undo.getInstance();
        u.addCommand("CHDIR");
        u.addCommand("COPY");
        u.addCommand("DATE");
        u.addCommand("DEL");
        u.addCommand("DIR");
        u.addCommand("EXIT");
        u.addCommand("FIND");
        u.showCommands();

//        Second class instance -> debugging: "u: Undo@758" same as "anotherU: Undo@758"
        Undo anotherU = Undo.getInstance();
        System.out.println("**** Print again first instance 'u' ****");
        anotherU.showCommands();

        System.out.println("**** Delete command ****");
        u.deleteCommand("EXIT");
        u.showCommands();

        System.out.println("**** Undo last command ****");
        u.undoLastCommand();
        u.showCommands();




    }
}
