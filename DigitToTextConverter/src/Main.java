/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        DigitToTextConverter itoe = new DigitToTextConverter();
        Scanner in = new Scanner(System.in);
        char ans='y' ;
        do{
            try{
                System.out.print("Enter an Integer(Digit only) : ");
                int value = in.nextInt();
        
                System.out.print("In text form : ");
                System.out.println(itoe.english_number(value));

                
        } catch (InputMismatchException e){
                System.out.println("ERROR, " + e.toString() + " IS DETECTED!");
                System.out.println("Please enter digits only (0-9).");
                in.next();
        }
            System.out.print("Continue? (y/n) : ");
            ans = in.next().charAt(0);
            
        }while(Character.toLowerCase(ans) == 'y');
        
            System.out.println("Your Welcome!!");        
        }      
}
