import java.util.Scanner;

/**Задача №2945. Следующее четное
 Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.

 Входные данные
 Вводится натуральное число.

 Выходные данные
 Выведите ответ на задачу.

 Примеры
 входные данные
 7
 выходные данные
 8
 входные данные
 8
 выходные данные
 10
*/

 public class NextEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println((number / 2 + 1) * 2);
    }
}
