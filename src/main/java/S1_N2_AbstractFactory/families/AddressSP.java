package S1_N2_AbstractFactory.families;

import java.util.Scanner;

public class AddressSP implements Address{
    @Override
    public String createAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra la dirección: ");
        String address = sc.nextLine();
        return address;

    }
}
