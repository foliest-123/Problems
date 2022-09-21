import java.util.*;

class IndexOfIndex {
    // 3 5 4 2 1

    static int finder(int a, List<Integer> p,List<Integer> ans) {

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) == a) {
                ans.add(i+1);
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        List<Integer> p = new ArrayList<>(List.of(5,2,1,3,4));
        //1 3 5 4 2
        List<Integer> ans = new ArrayList<>();
         
        for (int i = 1; i <= p.size(); i++) {
            for (int j = 0; j < p.size(); j++) {
                if (p.get(j) == i) {
                      finder(j + 1, p,ans);   
                }
            }
           

        }
        System.out.println(ans);
    }
}