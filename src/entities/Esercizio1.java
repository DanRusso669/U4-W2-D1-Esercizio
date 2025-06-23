package entities;

import exceptions.NumberLessThanZeroException;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) throws NumberLessThanZeroException {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);


        int[] randNums = new int[5];

        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = rand.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(randNums));

        while (true) {
            System.out.println("Choose the location of the number you want to change from 1 to 5 or enter 0 to exit: ");

            int index = Integer.parseInt(scan.nextLine());

            if (index == 0) {
                break;
            }

            try {
                if (index < 1) {
                    throw new NumberLessThanZeroException(index);
                } else if (index > 5) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                System.out.println("Choose a new number: ");
                int newNum = Integer.parseInt(scan.nextLine());

                randNums[index - 1] = newNum;

                System.out.println(Arrays.toString(randNums));

            } catch (NumberLessThanZeroException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter a valid location between 1 and 5.");
            } catch (NumberFormatException e) {
                System.out.println("Please. enter a valid number.");
            } finally {
                scan.close();
            }


        }
    }

}
