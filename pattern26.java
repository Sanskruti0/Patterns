public class pattern26 {
    public static void main(String[] args) {
        int alpahbet = 65;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)alpahbet);
            }
            System.out.println();
            alpahbet++;
        }
    }
}
/*

A
BB
CCC
DDDD
EEEEE

 */