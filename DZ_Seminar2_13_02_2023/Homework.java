// Написать метод который приводит сторку к нормальному виду

// строка на вход
// Добрый   день      Как  дела Все      хорошо

// выход
// Добрый день. Как дела. Все хорошо.

package DZ_Seminar2_13_02_2023;

public class Homework {
    public static void main(String[] args) {
        String hello = "      Добрый   день      Как    дела       Все         хорошо   ";
        System.out.println(modifiedString(hello));
    }

    public static String modifiedString(String str) {
        if (str.isEmpty())
            return "Строка пустая. Попробуйте ещё раз";
        str = str.trim();
        String modStr = str.replaceAll(" +", " ");
        StringBuilder sb = new StringBuilder(modStr);
        for (int i = 1; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.insert(i - 1, ".");
                i++;
            }
        }
        sb.append('.');
        return sb.toString();
    }
}
