import java.util.*;
class primePattern{


    static int[] prime(int n)
    {
        int[]arr=new int[n+1];
        int verify=0;
        
        for(int i=1;verify<arr.length;i++)
        {
            boolean flag=false;
            for(int j=2;j<i;j++)
            {
               if(i%j==0){
                flag=true;
                break;
               }
               else{
                continue;
               }
            }
            if(flag==false)
            {
                arr[verify]=i;
                verify++;
            }

        }

        return arr;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter input");
    int n=sc.nextInt();
   int[]a=prime(n);
    for(int i=0;i<=n;i++)
    {
        for (int j = 1; j <= i; j++) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        sc.close();
    }
    System.out.println(a.length);
}
}