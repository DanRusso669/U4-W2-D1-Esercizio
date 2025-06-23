package entities;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the miles traveled: ");
        int km = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the liters consumed");
        int liters = Integer.parseInt(scan.nextLine());

        try {
            if (liters == 0 || km == 0) {
                throw new ArithmeticException();
            }

            int kmPerLitre = km / liters;
            System.out.println("Your miles per liter are " + kmPerLitre);

        } catch (ArithmeticException e) {
            System.out.println("You can't divide for 0.");
        }

    }
}
