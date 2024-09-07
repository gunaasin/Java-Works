import java.util.Scanner;

public class PrintElementBasedOnSortingFormat {
	public static int[] SortingFormat(int []ar1,int[] ar2){
		int i=0,j=0,k=0;
		
		int[] array = new int[ ar1.length+ar2.length];
		
		
		while (i<ar1.length && j < ar2.length) {
			if(ar1[i]<=ar2[j]) {
				array[k++]=ar1[i++];
			}else{
				array[k++]=ar2[j++];
			}
		} 
		
//		remind elements stored hear !!!
		
		
	    while (i < ar1.length) {
            array[k++] = ar1[i++];
        }
	    
	    

	    
	    while (j < ar2.length) {
            array[k++] = ar2[j++];
        }
		return array;
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
		
		int[] arrays = SortingFormat(ar1,ar2);
		for (int value:arrays) {
			System.out.println(value);
		}
		
	}

}
