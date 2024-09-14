import java.util.Scanner;

public class PrintLongestConsecutiveSubarray {
	public static void maxConsecutive(int[] arr) {
		int i=0,count=0,max=Integer.MIN_VALUE;
		int la = 0;
		while(i<arr.length-1) {
			if(arr[i+1]-arr[i]==1) {
				count++;
				i++;
			}
			else{
				if(max<count) {
					max = count;
					la = i;
				}
				i++;
				count=1;
			}
		}
		
		if(max<count) {
			max = count;
			la = i;
		}
		
//		System.out.println(max +" "+la);
		
		int res = (la -max)+1;
		
//		System.out.println(res);
		for(int j=res ; j<=la;j++) {
			System.out.print(arr[j] + " ");
		}
		
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			
			
		}
		maxConsecutive(arr);

	}

}
