import java.util.Scanner;

/** Знак числа
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 В математике функция sign(x) (знак числа) определена так:
 sign(x) = 1,   если x > 0,
 sign(x) = -1, если x < 0,
 sign(x) = 0,   если x = 0.

 Для данного числа x выведите значение sign(x).
 Входные данные
 Вводится число x.

 Выходные данные
 Выведите ответ на задачу.

 Примеры
 входные данные
 179
 выходные данные
 1
 */

public class NumberSign {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x > 0) System.out.println(1);
        else if (x < 0) System.out.println(-1);
        else if (x == 0) System.out.println(0);
    }
}
