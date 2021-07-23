import java.util.Scanner;

/**Максимум из двух чисел
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Входные данные
 Даны два целых числа, каждое число записано в отдельной строке.

 Выходные данные
 Выведите наибольшее из данных чисел.

 Примеры
 входные данные
 1
 2
 выходные данные
 2
 */

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
