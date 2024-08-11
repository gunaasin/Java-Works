public class PassByValue {
    public static void main(String[] args) {
        String name = "guna" ;
        String nickName ;
        nickName = name;

        System.out.println(name);
        System.out.println(nickName);

// changed value not reflect in name
        System.out.println("--------------------------------------------");
        nickName = "vijay";
        System.out.println(nickName);



    }
}
