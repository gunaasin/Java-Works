class fun{
    int a = 10;
    int b = 29;
    int add()
    {
        int c = a*b;
        return c;
    }
}

class Method2 {
    public static void main(String[] args){
        fun mul = new fun();
        int res = mul.add();
        System.out.println(res);
    }
}