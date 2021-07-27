import java.util.Scanner;

/** Сложное уравнение
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Решить в целых числах уравнение ( ax + b ) : ( cx + d ) = 0.

 Входные данные
 Вводятся 4 числа: a, b, c и d; c и d не равны нулю одновременно.

 Выходные данные
 Необходимо вывести все целочисленные решения, если их число конечно, “NO” (без кавычек), если целочисленных решений нет,
 и “INF” (без кавычек), если их бесконечно много.

 Примеры
 входные данные
 1
 1
 2
 2
 выходные данные
 NO
 входные данные
 2
 -4
 7
 1
 выходные данные
 2
 */

public class ComplexEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        if (a == 0 && b == 0){
            System.out.println("INF");
        }else if (a == 0 || b * c == a * d){
            System.out.println("NO");
        }else if (b % a == 0){
            System.out.println(-b / a);
        }else System.out.println("NO");
    }
}
