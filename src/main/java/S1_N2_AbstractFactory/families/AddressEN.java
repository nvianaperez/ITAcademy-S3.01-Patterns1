package S1_N2_AbstractFactory.families;

import java.util.Scanner;

public class AddressEN implements Address{
    @Override
    public String createAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        return address;

    }

}
