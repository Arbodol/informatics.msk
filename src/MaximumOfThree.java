import java.util.Scanner;

/** Максимум из трех
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Входные данные
 Даны три целых числа, каждое записано в отдельной строке.

 Выходные данные
 Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).

 Примеры
 входные данные
 1
 2
 3
 выходные данные
 3
 */

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        if (x > y && x > z) System.out.println(x);
        else if (y > x && y > z) System.out.println(y);
        else if (z > x && z > y) System.out.println(z);
    }
}
