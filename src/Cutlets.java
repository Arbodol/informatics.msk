import java.util.Scanner;


public class Cutlets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        if (n <= k){
            System.out.println(m * 2);
        }else if (n * 2 % k == 0){
            System.out.println(m * (n * 2 / k));
        }else System.out.println(m * (1 + (n * 2 / k)));
    }
}
