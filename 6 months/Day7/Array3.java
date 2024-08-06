class Array3{
	public static void main(String[] args){
	int[][][] a = {{{1,2,3,4,5,},{12,12,12,2},{11,22,33,44,55,66,77}},{{1,2,5,},{12,12,1,2},{11,22,33,66,77}}};
	int i,j,k;
	
	for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				for(k=0;k<a[i][j].length;k++){
					System.out.print(a[i][j][k] + " ");
	
				}System.out.println();
			}System.out.println();
	}
	}
}