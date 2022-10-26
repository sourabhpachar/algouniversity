package two_dimensional_array;

import java.util.Scanner;

public class Transpose_of_matrix {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[][] arr= { {1, 2, 3},

	            {4, 5, 6},

	            {7, 8, 9}};
		int  [][]arr1=new int [arr.length][arr[0].length];
		int n=arr.length;
		int m=arr[0].length;
		//A1-using extra space
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				arr1[i][j]=arr[j][i];
//			}
//		}
		//A2 without using extra spaccce
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<m;j++) {
				int temp=arr[i][j];
			
		
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
