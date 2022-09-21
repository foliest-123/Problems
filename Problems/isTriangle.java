
import java.util.Scanner;

public class isTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] arr = new int[m][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        boolean upper = false;
        boolean lower = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && i < j)
                    lower = true;
                if (arr[i][j] != 0 && i > j)
                    upper = true;
            }
        }
        if (lower == false)
            System.out.println("lower");
        if (upper == false)
            System.out.println("upper");
        else
            System.out.println("not");
    }

}
