
import java.util.*;

public class nOccurances {
    public static int[] permutationEquation(int[] arr, int n) {
        // 5 2 1 3 4
        // 4 2 5 1 3

        // 4 3 5 1 2
        // 1 3 5 4 2
        int[] ans = new int[n];
     
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] a = permutationEquation(arr, n);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
