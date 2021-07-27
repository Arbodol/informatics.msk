import java.util.Scanner;

/** Уравнение
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Решить в целых числах уравнение ax + b = 0.

 Входные данные
 Вводятся 2 целых числа: a и b.

 Выходные данные
 Необходимо вывести все решения, если их число конечно, “NO” (без кавычек), если решений нет, и “INF” (без кавычек),
 если решений бесконечно много.

 Примеры
 входные данные
 6
 -2
 выходные данные
 NO
 входные данные
 1
 1
 выходные данные
 -1
 */

public class TheEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a == 0 && b == 0){
            System.out.println("INF");
        }else if (a != 0 && (b == 0 || Math.abs(a) <= Math.abs(b)) && (b % a) == 0){
            System.out.println(-b / a);
        }else System.out.println("NO");
    }
}
