import java.util.Scanner;

/**Задача №2939. Дележ яблок - 2
 N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?

 Входные данные
 Программа получает на вход числа N и K.

 Выходные данные
 Программа должна вывести искомое количество яблок.

 Примеры
 входные данные
 3
 14
 выходные данные
 2
 */
public class DividingApples2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        System.out.println(K % N);
    }
}
