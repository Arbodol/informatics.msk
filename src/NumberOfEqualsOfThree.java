import java.util.Scanner;

/** Количество равных из трех
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Входные данные
 Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.

 Выходные данные
 Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадают) или 0 (если все числа различны).

 Примеры
 входные данные
 1
 2
 2
 выходные данные
 2
 */

public class NumberOfEqualsOfThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        if (x == y && y == z && z == x){
            System.out.println("3");
        }else if (x == y || y == z || z == x){
            System.out.println("2");
        }else System.out.println("0");
    }
}
