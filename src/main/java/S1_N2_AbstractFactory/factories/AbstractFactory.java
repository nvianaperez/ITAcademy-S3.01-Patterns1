package S1_N2_AbstractFactory.factories;

import S1_N2_AbstractFactory.families.Address;
import S1_N2_AbstractFactory.families.Telephone;

public interface AbstractFactory {
    Address getAddress(String country);
    Telephone getTelephone(String country);
}
