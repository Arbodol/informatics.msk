import java.util.Scanner;

/** Задача №223. Линейный поиск - 1
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Напишите программу, которая определяет, сколько раз встречается заданное число x в данном массиве.

 Входные данные
 В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.

 Во второй строке вводятся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).

 В третьей строке содержится одно целое число x , не превосходящее по модулю 1000.

 Выходные данные
 Вывести одно число – сколько раз встречается x в данном массиве.

 Примеры
 входные данные
 5
 1 2 3 4 5
 3
 выходные данные
 1
 */

public class LinearSearch1 {
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
                count++;
            }
        }
        System.out.println(count);
    }


}