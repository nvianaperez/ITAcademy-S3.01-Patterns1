package S1_N2_AbstractFactory.families;

import java.util.Scanner;

public class TelephoneEN implements Telephone{
    @Override
    public String createTelephone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter telephone: ");
        String phone = "+44 "+sc.nextLine();
        return phone;
    }
}
