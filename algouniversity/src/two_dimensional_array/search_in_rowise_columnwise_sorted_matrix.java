package two_dimensional_array;

import java.util.Scanner;
//here arr[i-1][j]<arr[i][0]
public class search_in_rowise_columnwise_sorted_matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[][] arr= { {1, 2, 3},

            {4, 5, 6},

            {7, 8, 9}};
//A1-here we will keep pointer on last element of first row then if value is grater than this we will increase row else decrease it
//	int row=0;
//	int col=arr[0].length-1;
//	int k=sc.nextInt();
//	while(row<arr.length&&col>=0) {
//	if(k<arr[row][col]) {
//	   col--;
//	}
//	else if(k>arr[row][col]) {
//		row++;
//	}
//	else {
//		System.out.println(arr[row][col]+" ROW-"+row+" COL-"+col);
//		break;
//	}
//}

//A2-here we will convert it to linear array and do binary search as(last element of previous row will be less than the first element of current row
//we will get row index by dividing index by no of rows and will get column index by doing mod of no of cols with idx
 //lets say here row =3 and col=3
int[] arr1= {1,2,3,4,5,6,7,8,9};
int k=7;
int l=0;
int row=3,col=3;
int r=arr1.length;

while(l<=r) {
	int mid=l+(r-l)/2;
	System.out.println("in while loop");
	if(arr1[mid]>k) {
		r=mid-1;
	}
	else if(arr1[mid]<k) {
		l=mid+1;
	}
	else {
		System.out.println("row-"+mid/row+"col-"+mid%col);
		break;
	}
}



}
	
}
