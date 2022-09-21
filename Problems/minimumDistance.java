
import java.util.*;

public class minimumDistance {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(3,2,1,2,3));
        int fp = 0;
        int lp = a.size() - 1;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    int m = Math.abs(i - j);
                    ans=Math.min(ans, m);
                }
            }
        }
        System.out.println(ans);
    }
}
