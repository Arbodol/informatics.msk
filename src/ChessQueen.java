import java.util.Scanner;

/**Ферзь
        Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
        Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

        Входные данные
        Вводятся четыре числа: координаты ферзя и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.

        Выходные данные
        Требуется вывести слово YES, если ферзь может побить фигуру за 1 ход, в противном случае вывести слово NO

        Примеры
        входные данные
        1
        1
        8
        1
        выходные данные
        YES
        входные данные
        3
        2
        8
        3
        выходные данные
        NO
 */

public class ChessQueen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
