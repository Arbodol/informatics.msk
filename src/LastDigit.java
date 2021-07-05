import java.util.Scanner;

/**Задача №2941. Последняя цифра
 Дано натуральное число. Выведите его последнюю цифру.

 Входные данные
 Вводится натуральное число.

 Выходные данные
 Выведите ответ на задачу.

 Примеры
 входные данные
 179
 выходные данные
 9
*/

 public class LastDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(num % 10);
    }
}
