import java.util.*;

class increasePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int copy = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(copy + " ");
                copy += n - j;
            }
            System.out.println();
        }
        sc.close();
    }
}