package Pattern;
public class pattern11 {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=0; j<=6-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*

012345
01234
0123
012
01
0

 */