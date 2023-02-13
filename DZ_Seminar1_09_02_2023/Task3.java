// Реализовать простой калькулятор

package DZ_Seminar1_09_02_2023;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите оператор: ");
        char operator = scan.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        scan.close();

        calculation(num1, operator, num2);
    }

    public static void calculation(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                System.out.println("Ответ: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Ответ: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Ответ: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Ответ: " + (num1 / num2));
                break;
            default:
                System.out.println("Введён неверный оператор. Можно использовать только '+' '-' '*' '/'");
                break;
        }
    }
}
