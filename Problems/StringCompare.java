import java.util.*;
class StringCompare{
    public static void main(String[] args) {
        

           List<Integer>ans=new ArrayList<>();
           List<String>queries=new ArrayList<>(List.of("aba","xzxb","ab"));
           List<String>strings=new ArrayList<>(List.of("aba","baba","aba","xzxb"));
    
    for(int i=0;i<queries.size();i++)
    {
        int count=0;
        for(int j=0;j<strings.size();j++)
        {
         if(queries.get(i)==strings.get(j))
         {
             count++;
         }   
         
        }
        ans.add(count);
    }
System.out.println(ans);
    }
}