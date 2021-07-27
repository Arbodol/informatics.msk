import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextInt();
        double b = scn.nextInt();
        double c = scn.nextInt();
        double d = b * b - 4 * a * c;
        if (d > 0){
            double x = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x + "  " + y);
        }else if (d == 0){
            double x = -b / (2 * a);
            System.out.println(x);
        }else System.out.println();
    }
}
