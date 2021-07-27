import java.util.Scanner;

/** Тип треугольника
 Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
 Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.

 Входные данные
 Даны три натуральных числа – стороны треугольника.

 Выходные данные
 Необходимо вывести одно из слов: right для прямоугольного треугольника, acute для остроугольного треугольника, obtuse
 для тупоугольного треугольника или impossible, если входные числа не образуют треугольника.

 Примеры
 входные данные
 3
 4
 5

 выходные данные
 right
 */

public class TriangleType {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (c == (a + b) || a == (b + c) || b == (a + c)){
            System.out.println("right");
        }else if (c < (a + b) || a < (b + c) || b < (a + c)){
            System.out.println("acute");
        }else if (c > (a + b) || a > (b + c) || b > (a + c)){
            System.out.println("obtuse");
        }else System.out.println("impossible");
    }
}
