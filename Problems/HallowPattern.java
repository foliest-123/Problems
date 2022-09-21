/*
 * 4 4 4 4 4 4 4 
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4 
 */

public class HallowPattern {

    static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int n = 8;
        int d = n * 2 - 1;
        int[][] arr = new int[d][d];
        int initial = 0;
        int end = n;
        while (initial < n) {
            for (int i = initial; i < arr.length - initial; i++) {
                arr[initial][i] = arr[i][d - 1] = arr[d - 1][i] = arr[i][initial] = end;
            }
            d--;
            initial++;
            end--;
        }

        // for (int i = 0; i < arr.length; i++) {
        // arr[0][i]=arr[i][d-1]=arr[d-1][i]=arr[i][0]=n;
        // }
        // for (int i = 1; i < arr.length-1; i++) {
        // arr[1][i]=arr[i][d-2]=arr[d-2][i]=arr[i][1]=n-1;

        // }
        printArray(arr);
    }
}
