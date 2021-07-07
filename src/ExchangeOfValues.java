import java.util.Scanner;

public class ExchangeOfValues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = a;
        int d = b;
        System.out.println(d + " " + c);
    }
}
