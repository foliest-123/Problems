public class foundWord {

    static int find(char[][] arr, String s) {
        int inc = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (inc < s.length() && arr[i][j] == s.charAt(inc)) {
                    dfs(arr, i, j, s.charAt(0));
                }
            }

        }
        return 0;
    }

    static int dfs(char[][] arr, int i, int j, char s) {
        char check = s;
        return 0;
    }

    public static void main(String[] args) {
        char[][] arr = {{ 'a', 'z', 't' },
                         { 'o', 'o', 'h' },
                         { 'a', 'i', 'o' }};
        String s = "zoho";
        s.toLowerCase();
        System.out.println(find(arr, s));
    }
}
