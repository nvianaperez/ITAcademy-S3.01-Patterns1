package S1_N2_AbstractFactory;

import S1_N2_AbstractFactory.factories.AbstractFactory;
import S1_N2_AbstractFactory.factories.FabricaProductor;
import S1_N2_AbstractFactory.families.Address;
import S1_N2_AbstractFactory.families.Telephone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean exit;

        List<String> agenda = new ArrayList<>();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write country 'SP' or 'EN': ");
            String countryOption = sc.nextLine();
            System.out.println("Choose between 'ad' for address or 'tel' for telephone: ");
            String familyOption = sc.nextLine();


            AbstractFactory factory = FabricaProductor.getFactory(familyOption); //abstract factory
            if (familyOption.equalsIgnoreCase("ad")) {
                Address addressCountry = factory.getAddress(countryOption); // family factory and variants
                String countryAd = addressCountry.createAddress();
                agenda.add(countryAd);
                exit = isExit(sc);
            } else if (familyOption.equalsIgnoreCase("tel")) {
                Telephone telephoneCountry = factory.getTelephone(countryOption); // family factory and variants
                String countryTel = telephoneCountry.createTelephone();
                agenda.add(countryTel);
                exit = isExit(sc);
            } else {
                System.out.println("Typing error: write 'ad' or 'tel'");
                exit = isExit(sc);
            }
        } while (!exit);

        System.out.println("Elements in the agenda are: ");
        for (String item : agenda) {
            System.out.println("\t"+item );
        }
    }

    private static boolean isExit(Scanner sc) {
        boolean exit;
        System.out.println("Do you want to exit? ('true' or 'false')/ ¿Quieres salir?");
        exit = sc.nextBoolean();
        return exit;
    }
}

