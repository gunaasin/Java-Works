public class TestQu {
    public static void main(String[] args) {
        int n = 4 ;
        int num = n;
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" ");
            }for(int j = 0 ; j <= num ; j++){
//              if(i==0 || j==0 ||i==1&&j==3 || i==2&&j==2 || i==3&&j==1){
                if(i==0 || j==0 || j==4-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            num--;
        }
    }
}
