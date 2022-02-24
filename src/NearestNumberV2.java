import java.util.Scanner;

/**
 * Задача №225. Ближайшее число
 * Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 * Напишите программу, которая находит в массиве элемент, самый близкий по величине к  данному числу.
 * <p>
 * Входные данные
 * В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.
 * <p>
 * Во второй строке содержатся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).
 * <p>
 * В третьей строке вводится одно целое число x, не превосходящее по модулю 1000.
 * <p>
 * Выходные данные
 * Вывести значение элемента массива, ближайшее к x. Если таких чисел несколько, выведите любое из них.
 * Примеры
 * входные данные
 * 5
 * 1 2 3 4 5
 * 6
 * выходные данные
 * 5
 * входные данные
 * 5
 * 5 4 3 2 1
 * 3
 * выходные данные
 * 3
 */


public class NearestNumberV2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int MinDiff = 1000;
        int MinDiffIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = Math.abs(arr[i]-x);
            if (count <= MinDiff){
                MinDiff = count;
                MinDiffIndex = i;
            }
        }
        System.out.println(arr[MinDiffIndex]);
    }
}
