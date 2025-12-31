/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digittotextconverter;

/**
 *
 * @author GarouDa
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        DigitToTextConverter itoe = new DigitToTextConverter();
        Scanner in = new Scanner(System.in);

        String ans = "y";

        do {
            try {
                System.out.print("Enter an Integer : ");
                int value = in.nextInt();

                System.out.print("In text form : ");
                System.out.println(itoe.english_number(value));

            } catch (InputMismatchException e) {
                System.out.println("Not a number!");
                in.next(); // ✅ clear invalid input
                continue;
            }

            System.out.print("continue? (y/n) : ");
            ans = in.next();

        } while (ans.equalsIgnoreCase("y"));

        System.out.println("You're Welcome!!");
    }
}