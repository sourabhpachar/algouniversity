package two_dimensional_array;

import java.util.Scanner;

public class matrix_boundary_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] mat= { {1, 2, 3},

	            {4, 5, 6},

	            {7, 8, 9}};
		int  n=mat.length;
		int  m=mat[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0||j==0||i==n-1||j==m-1) {
					System.out.print(mat[i][j]+" ");
				}
			}
			
		}
	}

}
