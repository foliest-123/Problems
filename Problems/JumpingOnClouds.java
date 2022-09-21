class JumpingOnClouds {
    public static void main(String[] args) {
        int initial = 100;
        int[] arr = { 1, 1, 1, 0, 1, 1, 0, 0 ,0, 0};
        int i = 0;
        int j=0;
       for ( j = 3; j < arr.length; j+=3) {
       if(arr[j]==1){
        initial-=3;
       }
       else
       initial-=1;   
       }
       int add=0;
       if(j!=arr.length-1){
         add=arr[arr.length-1]==0?1:3;
       }
        System.out.println(initial-add);
    }
}