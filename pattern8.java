
public class pattern8 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==5){ // to print last row star
                for(int j=1; j<=5+3; j++){
                System.out.print("*");
                }
            }
            for(int j=1; j<=5-i; j++){ 
                System.out.print(" ");
            }
            System.out.print("*");  //tp print first star
            for(int j=1; j<=2*i-3 ; j++){ 
                System.out.print(" ");
            }
            if(i>1 && i<5){
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
*********   
s
 */