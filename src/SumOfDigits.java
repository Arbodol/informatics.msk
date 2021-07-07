import java.util.Scanner;

/**Задача №2944. Сумма цифр
 Дано трехзначное число. Найдите сумму его цифр.

 Входные данные
 Вводится трехзначное число.

 Выходные данные
 Выведите ответ на задачу.

 Примеры
 входные данные
 179
 выходные данные
 17
 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        System.out.println(a + b + c);
    }
}
