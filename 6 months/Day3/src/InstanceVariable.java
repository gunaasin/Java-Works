// Instance variable
// *>> Instance variable directly create inside class
// *>> Instance variable memory allocated in heap segment
// *>> JVM Allocate default values



class main{
    String name;
    int age;
    boolean hasPassport;
}

public class InstanceVariable {
    public static void main(String[] args)
    {
         main identiy = new main();
         System.out.println(identiy.name);
         System.out.println(identiy.age);
         System.out.println(identiy.hasPassport);

         //   JVM Allocated default values

        System.out.println("-------------------------------------------------------------------");

        identiy.name = "Guna";
        identiy.age = 21;
        identiy.hasPassport = true;

        System.out.println(identiy.name);
        System.out.println(identiy.age);
        System.out.println(identiy.hasPassport);
    }
}




