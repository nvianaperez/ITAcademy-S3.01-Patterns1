package S1_N2_AbstractFactory.factories;

public class FabricaProductor {

    public static AbstractFactory getFactory (String dataType) {
        if(dataType.equalsIgnoreCase("ad")) {
            return new AddressFactory();
        } else if (dataType.equalsIgnoreCase("tel")) {
            return new TelephoneFactory();
        }
        return null;
    }

}
