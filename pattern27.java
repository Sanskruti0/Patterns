public class pattern27 {
    public static void main(String[] args) {
        int alpahbet = 65;
        for(int i=1; i<=5; i++){
            for(int j=0; j<5-i+1; j++){
                System.out.print((char)(alpahbet+j));
            }
            System.out.println();
        }
        for(int i=2; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print((char)(alpahbet+j));
            }
            System.out.println();
        }
    }
}
/*

ABCDE
ABCD
ABC
AB
A
AB
ABC
ABCD
ABCDE

 */