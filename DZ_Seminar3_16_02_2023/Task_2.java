//Пусть дан произвольный список целых чисел, удалить из него четные числа

package DZ_Seminar3_16_02_2023;

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = fillListNotVoid(new ArrayList<>()); // Можно ли так делать в реальной разработке?
        ArrayList<Integer> numbers = new ArrayList<>();
        fillList(numbers);
        System.out.println(numbers);
        deleteEvens(numbers);
        System.out.println(numbers);


    }

    public static void fillList(ArrayList<Integer> numList) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numList.add(rand.nextInt(1, 20));
        }
    }

    public static void deleteEvens(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 0) {
                numList.remove(i);
                i--;
            }
        }
    }

    public static ArrayList<Integer> fillListNotVoid(ArrayList<Integer> numList) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numList.add(rand.nextInt(1, 20));
        }
        return numList;
    }
}
