public class primeFactor {

    static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7;
        int maxprime = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i) == true && maxprime < i) {
                maxprime = i;
            }
        }
        System.out.println(maxprime);
    }
}
