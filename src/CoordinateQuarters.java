import java.util.Scanner;

public class CoordinateQuarters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        if ((x1 * x2) > 0 && (y1 * y2) > 0){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
