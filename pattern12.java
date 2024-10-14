
public class pattern12 {
    public static void main(String[] args) {
        int num = 1;
        for(int i=1; i<=7; i+=2){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                }
                num += 2;
                System.out.println();
            }
        }
    }

/*

1
333
55555
7777777

 */