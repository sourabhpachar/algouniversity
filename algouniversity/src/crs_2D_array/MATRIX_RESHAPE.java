package crs_2D_array;

import java.util.Scanner;

public class MATRIX_RESHAPE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int r=sc.nextInt();

        int c=sc.nextInt();

        
		int arr[][] = new int[n][m];

		int []arr1=new int[r*c];
		int[][]arr2=new int[r][c];
		int noOfElements = n * m;
        

		// read array elements row wise.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		if(r*c!=noOfElements) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(arr[i][j]);
				}
			}
		}
		else {
			int k=0;
			boolean check=true;
			for (int i = 0; i < n; i++) {
				if(check==false) {
					break;
				}
				for (int j = 0; j < m; j++) {
					arr1[k]=arr[i][j];
					k++;
					if(k>=r*c) {
						check=false;
						break;
					}
				}
			}
			
			int C=0;
			for (int i = 0; i < k; i++) {
				
				System.out.print(arr1[i]);
				C++;
				if(C==c) {
					C=0;
					System.out.println();
				}
			}
			
		}
	}

}
