import java.util.*;

class patternDecrease {

    /*
     * 5 4 3 2 1 2 3 4 5
     * 5 4 3 2 2 3 4 5
     * 5 4 3 3 4 5
     * 5 4 4 5
     * 5 5
     * 5 4 4 5
     * 5 4 3 3 4 5
     * 5 4 3 2 2 3 4 5
     * 5 4 3 2 1 2 3 4 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");
        int n = sc.nextInt();
        int copy = n;
        int space = 0;

        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < copy; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < copy; j++) {
                System.out.print(" *");
            }
            System.out.println();
            if (i < n){
                copy--;
                space+=2;
        }
            if (i >= n){
                copy++;
            space-=2;
            }

        }

    }

}
