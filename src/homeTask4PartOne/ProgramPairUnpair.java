/*Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним.
Якщо користувач введе не ціле число, то повідомляти йому про помилку.
 */
package homeTask4PartOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPairUnpair {

    public static void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");

        int number;
            try{
                number = scanner.nextInt();
            }catch (InputMismatchException e){
                throw new RuntimeException("Input number is not integer");
            }
        if (number % 2 ==0){
            System.out.println(" Number pair");
        }else{
            System.out.println(" Number unpair");
        }

    }
}
