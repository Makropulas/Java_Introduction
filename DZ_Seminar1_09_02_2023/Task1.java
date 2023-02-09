// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package DZ_Seminar1_09_02_2023;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = scan.nextInt();
        scan.close();

        int triangNum = triangularNumber(n);
        double factorial = calcFactorial(n);

        System.out.println();
        System.out.printf("n-ое треугольное число %d = %d\n", n, triangNum);
        System.out.println(n + "! = " + factorial);
    }

    public static int triangularNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static double calcFactorial(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}