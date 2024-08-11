class cal{
    int c ;
    int add(int a , int b){
            c=a+b;
            return c;
    }
}

public class Method4 {
    public static void main(String[] args) {
        int a = 22;
        int b = 33;

        cal res = new cal();
        int val = res.add(a,b);
        System.out.println(val);

    }
}
