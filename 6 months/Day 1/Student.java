import java.util.Scanner;

class Student{
	public static void main(String[] args){
   		Scanner info= new Scanner(System.in);
		System.out.println("Enter the student name :");
		String name = info.nextLine();
		System.out.println("Enter the student department :");
		String dep = info.nextLine();
		System.out.println("Enter the student score :");
		int score = info.nextInt();
		int mark = score/10;
		System.out.println("Student Name  :" + name + ", Student Department : " + dep + ", Student Mark :" + mark  );
		
	}	
}