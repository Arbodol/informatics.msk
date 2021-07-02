import java.util.Scanner;

/**Задача №2936. Гипотенуза
 Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.

 Входные данные
 В двух строках вводятся два числа (числа целые,положительные, не превышают 1000).

 Выходные данные
 Выведите ответ на задачу.*/

public class hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = input.nextInt();
        if (a < 0 || a > 1000){
            System.out.println("Число должно быть положительным и не превышать 1000");
        }
        System.out.println("Введите второе число: ");
        int b = input.nextInt();
        if (b < 0 || b > 1000){
            System.out.println("Число должно быть положительным и не превышать 1000");
        }
        double hypo = Math.sqrt((a*a)+(a*a));
        System.out.println(hypo);
    }
}
