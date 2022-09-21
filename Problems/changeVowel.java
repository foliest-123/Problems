import java.util.*;

public class changeVowel {

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();

        int front = 0;
        char[] arr = s.toCharArray();
        int last = arr.length - 1;
        while (front < last) {
            if (isVowel(arr[front]) && isVowel(arr[last])) {
                char temp = arr[front];
                arr[front] = arr[last];
                arr[last] = temp;
                front++;
                last--;
            } else if (isVowel(arr[front]) == true && isVowel(arr[last]) != true) {
                last--;
            } else if (isVowel(arr[front]) != true && isVowel(arr[last]) == true) {
                front++;
            } else {
                last--;
                front++;
            }
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
