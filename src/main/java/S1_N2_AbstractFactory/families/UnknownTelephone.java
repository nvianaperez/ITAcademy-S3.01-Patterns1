package S1_N2_AbstractFactory.families;

public class UnknownTelephone implements Telephone{

    @Override
    public String createTelephone() {

        return "Unknown country.";
    }
}
