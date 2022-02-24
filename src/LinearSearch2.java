import java.util.Scanner;

/**
 * Задача №224. Линейный поиск - 2
 * Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 * Напишите программу, которая определяет, встречается ли заданное число x в данном массиве.
 *
 * Входные данные
 * В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.
 *
 * Во второй строке вводятся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).
 *
 * В третьей строке содержится одно целое число x, не превосходящее по модулю 1000.
 *
 * Выходные данные
 * Вывести YES , если число x встречается в данном массиве, и NO в противном случае.
 *
 * Примеры
 * входные данные
 * 5
 * 1 2 3 4 5
 * 3
 * выходные данные
 * YES
 */

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                count = 1;
                break;
            }
            }
        if (count == 1){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}
