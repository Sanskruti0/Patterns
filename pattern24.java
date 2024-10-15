public class pattern24 {
    public static void main(String[] args) {
        int rows = 5;
    
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
               }
            for (int j=i; j<=rows; j++) {
                System.out.print(j + " ");
                }
                System.out.println();
        }
        
        for (int i=rows-1; i>=1; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
                }
            for (int j=i; j<=rows; j++) {
                System.out.print(j + " ");
                }
                System.out.println();
                }
            }
}
        
/*

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/  
