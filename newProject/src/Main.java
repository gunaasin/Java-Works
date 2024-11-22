

 class module{
    int a = 10;
    final int G = 17;
    void pro(){

    }
}


class demo extends module{
    @Override
  void pro(){

  }
}


public class Main {
    public static void main(String[] args) {
demo d = new demo();
d.pro();
    }
}