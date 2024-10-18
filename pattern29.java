public class pattern29 {
    public static void main(String[] args) {
        int a = 65;
        int rows = 5;
        for(int i=0; i<=rows; i++){
            for(int j=0; j<rows-i; j++){
                System.out.print(" ");
            }

            System.out.print((char)(a+i));

            if(i>0){
            for(int j=0; j<2*i-1; j++){
                System.out.print(" ");
            }
            System.out.print((char)(a+i));
            }
            
            System.out.println();
        }

        for(int i=rows-1; i>=0; i--){
            for(int j=0; j<rows-i; j++){
                System.out.print(" ");
            }

            System.out.print((char)(a+i));

            if(i>0){
            for(int j=0; j<2*i-1; j++){
                System.out.print(" ");
            }
                System.out.print((char)(a+i));
            }

            System.out.println();
        }
    }
}
/*


     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A

     
 */