import java.util.Scanner;

public class test {
	public static int find(int[] ar) {
		
		int max =Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length-1; i++)
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[i]==ar[j])
				{
					
					max= ar[i]>max ?ar[i]:max;
	
				}
			}
//			return max;
		}
		return 1;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] ar =new int[n];
		System.out.println(ar.length);
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
		System.out.println(find(ar));

	}

}
