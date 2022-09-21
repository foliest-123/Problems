import java.util.Random;

public class BasedOnindex {
    public static void main(String[] args) {

        //int n=new Random().nextInt(6);
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(100);
        }
        int[] ans = new int[arr.length];

        int oddIndex = 1;
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
           if( evenIndex<arr.length && arr[i]%2==0)
           {
            ans[evenIndex]=arr[i];
            evenIndex+=2;
           }
           else if( oddIndex<arr.length && arr[i]%2!=0){
            ans[oddIndex]=arr[i];
            oddIndex+=2;
           }
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }
}
