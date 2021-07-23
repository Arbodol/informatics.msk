import java.util.Scanner;

/**  Какое из чисел больше?
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Входные данные
 Даны два целых числа, каждое записано в отдельной строке.

 Выходные данные
 Программа должна вывести число 1, если первое число больше второго, число 2, если второе больше первого, или число 0, если они равны.

 Примеры
 входные данные
 1
 2
 выходные данные
 2
 */

public class WhichNumberIsGreater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x > y) System.out.println("1");
        else if (x < y) System.out.println("2");
        else if (x == y) System.out.println("0");
    }
}
