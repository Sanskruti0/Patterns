public class pattern28 {
    public static void main(String[] args) {
        int a = 65;
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print((char)(a+j) + " ");
            }
            System.out.println();
        }
    }
}
/*

     A 
    A B 
   A B C
  A B C D
 A B C D E
A B C D E F

 */