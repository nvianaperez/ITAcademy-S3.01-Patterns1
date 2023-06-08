package S1_N2_AbstractFactory.families;

import java.util.Scanner;

public class TelephoneSP implements Telephone{

    public String createTelephone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el teléfono: ");
        String phone = "+34 "+sc.nextLine();
        return phone;
    }
}

