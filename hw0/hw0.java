public class draw {
   public static void main(String[] args) {
      drawTriangle(5);
   }
   public static void drawTriangle(int n){
      if(n==0){
         return;
      }
      drawTriangle(n-1);
      for(int i=0;i<n;i++){
         System.out.print("*");
      }
      System.out.println();

   }
}

public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
       for(int i=0;i<a.length;i++){
          if(a[i]>0){
             for(int j=1;j<=n&&i+j<a.length;j++){
             a[i]+=a[i+j];
             }
          }
       }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
