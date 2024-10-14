
public class pattern16 {
    public static void main(String[] args) {
        char num = 65;
        for(int i=1; i<=7; i++){
            for(int j=1; j<=i; j++){
                if(num >= 91)
                break;
                System.out.print(num + " ");
                num+=1;
            }
            System.out.println();
        }
    }
}
/*

A
B C
D E F
G H I J
K L M N O
P Q R S T U
V W X Y Z

 */

