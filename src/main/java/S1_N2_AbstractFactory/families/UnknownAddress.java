package S1_N2_AbstractFactory.families;

public class UnknownAddress implements Address{

    @Override
    public String createAddress() {
        return "Unknown country.";
    }
}
