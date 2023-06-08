package S1_N2_AbstractFactory.factories;

import S1_N2_AbstractFactory.families.*;

public class AddressFactory implements AbstractFactory{
    @Override
    public Address getAddress(String country) {
        if(country == null) return new UnknownAddress();
        if(country.equalsIgnoreCase("SP")) {
            return new AddressSP();
        } else if (country.equalsIgnoreCase("EN")) {
            return new AddressEN();
        }
        return new UnknownAddress();
    }
    @Override
    public Telephone getTelephone(String country) {
        return null;

    }
}

