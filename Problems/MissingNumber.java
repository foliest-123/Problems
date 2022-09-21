
import java.util.*;

class MissingNumber {

    static void findNumber(int[] arr) {
        int verifier = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (verifier != arr[i]) {
                System.out.print(verifier + " ");
                i--;
            }
            verifier++;
        }

    }

    static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        System.out.print("Missing Numbers are:");
        findNumber(arr);

    }
}