public class Main {
    public static void main(String[] args) {
      String s1 = "JAVA";
      String s2 = new String("JAVA");


      String s4 = s2.concat(s1);
      System.out.println(s4);
     String s3 = s2.toUpperCase();
      if(s1==s2) {
          System.out.println("Same");
      }else{
          System.out.println("Different");
      }

      if(s1.equals(s2)) {
          System.out.println("Same");

      }else {
          System.out.println("Different");
      }
    }
}