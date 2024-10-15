public class pattern20 {
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;
        for(int i=1; i<=rows; i++){
            if(i == 1 | i == 4){
                    System.out.print("333");
            }
            else{
            System.out.print("3" + num + "3");
            num++;
            }
            System.out.println();
        }
    }
}
/*

333
313
323
333

 */