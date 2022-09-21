class islands {

    static int islandCount(char[][] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == '1') {
                    ans += 1;
                    dfs(arr, i, j);
                }
            }
        }
        return ans;
    }

    static void dfs(char[][] arr, int i, int j) {
        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr[0].length - 1 || arr[i][j] == '0')
            return;
        arr[i][j] = '0';
        dfs(arr, i + 1, j);
        dfs(arr, i, j + 1);
        dfs(arr, i, j - 1);
        dfs(arr, i - 1, j);
    }

    public static void main(String[] args) {
        char[][] arr = { { '1', '0', '0', '0' },
                         { '0', '0', '1', '0' },
                         { '0', '1', '0', '0' } };
        System.out.println("Total island: "+islandCount(arr));
    }
}