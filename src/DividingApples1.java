import java.util.Scanner;
/**N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется
 * каждому школьнику?
 *
 *  Входные данные
 *  Программа получает на вход числа N и K.
 *
 *  Выходные данные
 *  Программа должна вывести искомое количество яблок.
 *
 *  Примеры
 *  входные данные
 *  3
 *  14
 *
 *  выходные данные
 *  4
 */

public class DividingApples1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        System.out.println(K / N);
    }
}
