class bike{
    java.lang.String name;
    float milage;
}


public class ArrayVal {
    public static void main(String[] args) {
       bike a = new bike();
       a.name = "Hero";
       bike b = new bike();
       b.milage = 5.0f;

       System.out.println(a.name);
       System.out.println(b.milage);
    }
}