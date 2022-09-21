

import java.util.*;

public class MinimumJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int jump = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int i = 0;
        while (i < n - 1) {
            i += arr[i];
            jump++;
        }
        System.out.println(jump);
    }

}
