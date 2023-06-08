package S1_N2_AbstractFactory.factories;

import S1_N2_AbstractFactory.families.*;

public class TelephoneFactory implements AbstractFactory{

    @Override
    public Telephone getTelephone(String country) {
        if(country == null) return new UnknownTelephone();
        if(country.equalsIgnoreCase("SP")) {
            return new TelephoneSP();
        } else if (country.equalsIgnoreCase("EN")) {
            return new TelephoneEN();
        }
        return new UnknownTelephone();
    }
    @Override
    public Address getAddress(String country) {
        return null;

    }
}

