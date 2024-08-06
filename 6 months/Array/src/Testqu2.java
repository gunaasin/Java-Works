public class Testqu2 {
    public static void main(String[] args){
        int n =5;
        int ch = 'A';
        System.out.println(ch);
        char le = 'A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(le + j-1) + " ");
            }
            System.out.println();
        }
    }
}
