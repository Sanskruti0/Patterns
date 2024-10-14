
public class pattern9 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<=2*i-3; j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<=2*(4-i)-3; j++){
                System.out.print(" ");
            }
            if(i!=3){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

   *
  * *
 *   *
*     *
 *   *
  * *
   *
   
 */