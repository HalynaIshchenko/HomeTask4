/*Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.
 */
package homeTask4PartTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramSum {

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 : ");

        int number1 = readNumber(scanner);
        System.out.println("Enter number 2 : ");
        int number2 = readNumber(scanner);
        System.out.println( number1 + number2);

    }

    private static int readNumber(Scanner scanner) {
        int number;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new RuntimeException("Input number is not integer");
        }
        return number;
    }
}
