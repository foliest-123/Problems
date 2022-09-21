import java.util.*;

public class ACM {

    static int compare(String s1,String s2)
    {
       int count=0;
       
       for (int i = 0; i < s1.length(); i++) {
        if(s1.charAt(i)=='1' || s2.charAt(i)=='1')
        {
            count++;
        }
       }
       
       
       
       return count;
    }
    public static void main(String[] args) {
        List<String>topic=new ArrayList<>(List.of("10101","11100","11010","00101"));
        List<Integer>list=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int a=0;
        int max=0;

        for (int i = 0; i < topic.size(); i++) {
            
            for (int j = i+1; j < topic.size(); j++) {
                 a=compare(topic.get(i), topic.get(j));
                 list.add(a);
                 max=Math.max(max, a);
                }
      }
      int count=0;
      ans.add(max);
      for (Integer l : list) {
        if(l==max)
        count++;
      }
      ans.add(count);
System.out.println(ans);
       

    }
}
