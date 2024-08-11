/// pass by Reference or Id only change on refId
/// one object define multiple id >>>>> ex; one person have multiple name but person is same
/// only change and use id in object



class info{
    int id;
    int age;
    String name;
    float salary;
}



public class PassByReference {
public static void main(String[] args) {
    info obj = new info();
        obj.id = 1725;
        obj.age = 21;
        obj.name = "Guna";
        obj.salary = 5.5f;

        System.out.println(obj.id);
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.salary);


        System.out.println("---------------------------------------------------------");
        info obj2;
        obj2 = obj;


        System.out.println(obj2.id);
        System.out.println(obj2.age);
        System.out.println(obj2.name);
        System.out.println(obj2.salary);


    System.out.println("---------------------------------------------------------");

       obj2.age = 20;
       obj2.name = "Nisha";

       System.out.println(obj2.age);
       System.out.println(obj2.name);
       System.out.println(obj2.salary);


    System.out.println("---------------------------------------------------------");

       info obj3 ;
       obj3 = obj2;

       System.out.println(obj3.name);
       System.out.println(obj2.name);
       System.out.println(obj.name);


}
}
