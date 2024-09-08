import java.util.Scanner;

public class mergeMultipleArrays {

	
	public static void findVal(int[]ar1, int[]ar2,int[]ar3) {
		
		int[] array = new int[ar1.length + ar2.length + ar3.length] ;
		int i=0,k=0;
		
		while(k<array.length) {
			if(i<ar1.length){
				array[k++]=ar1[i];
			}
			if(i<ar2.length){
			    array[k++]=ar2[i];
			}
			if(i<ar3.length){
				array[k++]=ar3[i];
			}
			i++;
		}
		
		
		
		for(int a=0;a<array.length;a++) {
			System.out.print(array[a] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] ar1 = new int[n1];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=scan.nextInt();
		}
		int n2 = scan.nextInt();
		int[] ar2 = new int[n2];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i]=scan.nextInt();
		}
		int n3 = scan.nextInt();
		int[] ar3 = new int[n3];
		for (int i = 0; i < ar3.length; i++) {
			ar3[i]=scan.nextInt();
		}

		
		findVal(ar1, ar2,ar3);
	}

}
