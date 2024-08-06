import java.util.Scanner;

class Array{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the how many Scholl are there : ");
		int Sch = scan.nextInt();
		
		int[][][] a = new int[Sch][][];
		int i,j,k;
		
			for(i = 0; i< a.length; i++){
			
				System.out.print("Enter the "+ (i+1) +" Scholl how many class :");
				int cls = scan.nextInt();
				a[i]=new int[cls][];
				
				for(j=0;j< a[i].length;j++){
					System.out.print("Enter the "+(i+1) +" Scholl "+(j+1) +" th class how many Student : ");
					int sdt = scan.nextInt();
					a[i][j]= new int [sdt];
					
					for( k=0 ;k<a[i][j].length;k++){
						System.out.print("Enter the "+ (i+1) +" Scholl "+(j+1) +" th class "+ (k+1) + " th Student age :");
					    a[i][j][k] = scan.nextInt();
					   
					};
				};
					
			};

			
			for(i = 0; i< a.length; i++){
			
				
				
				for(j=0;j< a[i].length;j++){
					
					for( k=0 ;k<a[i][j].length;k++){
						System.out.print( a[i][j][k]+" ");
					   
					};
					System.out.println();
				};
				System.out.println();
					
			};System.out.println();
		
	
	};
};