package Assignment_01;

import java.util.Scanner;

public class test {

	public static void transpose(int[][]arr) {
		
	}
	public static void reverse_column(int[][]arr) {
		int n=arr.length;
		int m=arr[0].length;
		int mid=n/2;
		for(int i=0;i<mid;i++) {
			for(int j=0;j<m;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[n-1-i][j];
				arr[n-1-i][j]=temp;
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[][] arr= { {1, 2, 3},

            {4, 5, 6},

            {7, 8, 9}};
  reverse_column(arr);
  }
}
