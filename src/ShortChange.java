import java.util.Scanner;

/** Сдача
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Товар стоит a руб. b коп. За него заплатили c руб. d коп. Сколько сдачи требуется получить?

 Входные данные
 Вводятся 4 числа: a, b, c и d.

 Выходные данные
 Необходимо вывести 2 числа: e и f, число рублей и копеек, соответственно.

 Примеры
 входные данные
 5
 5
 6
 5
 выходные данные
 1 0
 входные данные
 2
 17
 2
 18
 выходные данные
 0 1
 */


public class ShortChange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int e = (c * 100 + d - a * 100 - b) / 100;
        int f = (c * 100 + d - a * 100 - b) % 100;
        System.out.println(e + " " + f);
    }
}
