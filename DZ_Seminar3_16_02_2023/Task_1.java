//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package DZ_Seminar3_16_02_2023;

import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(1, 100));
        }
        System.out.println("Целочисленный список: " + numbers);
        System.out.println("Минимальное число: " + findMin(numbers));
        System.out.println("Максимальное число: " + findMax(numbers));
        System.out.println("Среднее арифметическое: " + findAverage(numbers));
    }

    public static int findMin(ArrayList<Integer> arrList) {
        int min = arrList.get(0);
        for (int i : arrList) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int findMax(ArrayList<Integer> arrList) {
        int max = arrList.get(0);
        for (int i : arrList) {
            if (i > max) max = i;
        }
        return max;
    }

    public static double findAverage(ArrayList<Integer> arrList) {
        double sum = 0;
        for (int i : arrList) sum += i;
        return sum / arrList.size();
    }
}
