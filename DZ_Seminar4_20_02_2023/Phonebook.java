// Реализовать телефонный справочник
// HashMap<Login, Список телефонов>
// - добавлять телефон
// - удалять телефон
// - находить по логину телефон/список телефонов

package DZ_Seminar4_20_02_2023;

import java.util.*;

public class Phonebook {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, HashSet<String>> dict = new HashMap<>();
        while (true) menu(dict);
    }

    public static void menu(Map<String, HashSet<String>> dict) {
        System.out.print("""
                Меню:

                1 - Добавить телефон
                2 - Удалить телефон
                3 - Найти по логину телефон/список телефонов
                0 - Выход

                Введите номер команды:\s""");

        String command = input.nextLine();

        switch (command) {
            case "1" -> addNumber(dict);
            case "2" -> removeNumber(dict);
            case "3" -> getNumber(dict);
            case "0" -> System.exit(0);
            default -> {
                System.out.println("Неверная команда. Возврат в меню");
                pause();
            }
        }
    }

    public static void addNumber(Map<String, HashSet<String>> dict) {
        String login = enterLogin();
        HashSet<String> hs = dict.getOrDefault(login, new HashSet<>());
        String number = enterPhoneNumber();
        hs.add(number);
        dict.put(login, hs);
        pause();
    }

    public static void removeNumber(Map<String, HashSet<String>> dict) {
        String login = enterLogin();
        HashSet<String> hs = dict.getOrDefault(login, new HashSet<>());
        String number = enterPhoneNumber();
        hs.remove(number);
        dict.put(login, hs);
        pause();
    }

    public static void getNumber(Map<String, HashSet<String>> dict) {
        String login = enterLogin();
        if (dict.containsKey(login)) {
            System.out.println(login + "=" + dict.get(login));
        } else {
            System.out.printf("По запросу '%s' результатов нет\n", login);
        }
        pause();
    }

    public static String enterLogin() {
        System.out.print("Введите логин: ");
        return input.nextLine();
    }

    public static String enterPhoneNumber() {
        System.out.print("Введите телефон: ");
        return input.nextLine();
    }

    public static void pause() {
        System.out.print("Для продолжения нажмите Enter ");
        input.nextLine();
        System.out.println();
    }
}
