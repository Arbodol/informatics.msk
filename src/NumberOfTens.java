import java.util.Scanner;

/**Задача №2942. Число десятков двузначного числа
 Дано двузначное число. Найдите число десятков в нем.

 Входные данные
 Вводится двухзначное число.

 Выходные данные
 Выведите ответ на задачу.

 Примеры
 входные данные
 42
 выходные данные
 4*/

public class NumberOfTens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println(a / 10);
    }
}
