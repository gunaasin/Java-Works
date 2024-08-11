//LocalVariable
// Local variable create inside a method;
// Memory allocated directly on a Stack segment
// JVM not allocate default value
// local variable can't use without intialitaion

public class LocalVariable {
    public static void main(String[] args) {
        String name;
        int numOfSeats;
        boolean petrol;


        name = "Harrier";
        numOfSeats = 5;
        petrol = true;

        System.out.println(name);
        System.out.println(numOfSeats);
        System.out.println(petrol);
    }
}
