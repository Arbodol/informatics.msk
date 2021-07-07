import java.util.Scanner;

/** Задача №2951. Стоимость покупки
 Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить
 за n пирожков.

 Входные данные
 Программа получает на вход три числа: a, b, n.

 Выходные данные
 Программа должна вывести два числа: стоимость покупки в рублях и копейках.

 Примеры
 входные данные
 10
 15
 2
 выходные данные
 20 30
 */

public class PurchaseCost {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int n = scn.nextInt();
        int cost = n * (100 * a + b);
        System.out.println(cost / 100 + " " + cost % 100);
    }
}
