import java.util.Scanner;

/**Задача №2943. Число десятков
 Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его десятичной записи).

 Входные данные
 Вводится неотрицательное целое число.

 Выходные данные
 Выведите ответ на задачу.

 Примеры
 входные данные
 179
 выходные данные
 7
 */

public class NumberOfTens2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(number / 10 % 10);
    }
}
