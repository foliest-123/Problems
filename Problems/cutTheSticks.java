
import java.util.*;

public class cutTheSticks {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(List.of(5, 4, 4, 2, 2, 8));
        List<Integer> ans = new ArrayList<Integer>(List.of(arr.size()));
        
        
        
        while (true) {
            int count = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.size(); i++) {

             if(arr.get(i)>0)
             {
           if(arr.get(i)<min)
               min=arr.get(i);
             }

            }
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - min);
                if (arr.get(i) > 0)
                    count++;
            }
            if (count == 0)
                break;

            ans.add(count);

           
        }
        System.out.println(ans);
    }
}
