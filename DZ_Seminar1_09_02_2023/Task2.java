// Вывести все простые числа от 1 до 1000

package DZ_Seminar1_09_02_2023;

public class Task2 {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        System.out.printf("Простые числа от %d до %d:\n", min, max);
        System.out.println(findPrimeNumbers(min, max));
    }

    public static String findPrimeNumbers(int min, int max) {
        String result = "";
        if (min < 2) {
            min = 2;
            result += (min + " ");
            min++;
        }
        boolean prime;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                prime = numberCheck(i);
                if (prime)
                    result += (i + " ");
            }
        }
        return result;
    }

    public static boolean numberCheck(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
