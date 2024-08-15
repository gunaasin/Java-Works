/// This method represent by the no input no output
/// Instance variable memory allocated in stack segment
/// Local variable memory allocated in heap segment



class calc
{
    int a = 10;
    int b = 50;
    void add()
    {
        int c = a+b;
        System.out.println(c);
    }
}

public class Method{
    public static void main(String[] args)
    {
        calc addition = new calc();
        addition.add();


    }
}