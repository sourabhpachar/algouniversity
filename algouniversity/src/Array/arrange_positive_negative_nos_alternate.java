package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//here we have to arrange +ve and -ve nos alternatively and remaining nos at the end irrespective of their sign as we dont have other sign nos
public class arrange_positive_negative_nos_alternate {

	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//A1-> we can sort array then print one element from back and one from front it will be nlogn complexity
	
	int []arr= {-1,-3,2,4,5,6,-7,8,9};
//	Arrays.sort(arr);
//	int i=0;
//	int j =arr.length-1;
//	while(i<j) {
//		System.out.println(arr[j]);
//		System.out.println(arr[i]);
//		j--;i++;
//	}
	//A2 we can use extra space and create two arrays for -ve and +ve nos n complexity
	
	int left=0;int mid=0;
	int right=arr.length-1;
//->A1 for arranging elements of array according to signs -ve to left and positive to right	
//	while(mid<=right) {
//		if(arr[mid]<0) {
//			swap(arr,mid,left);
//			left++;
//			mid++;
//		}
//		if(arr[mid]>=0) {
//			mid++;
//		}
//		
//	}
	////->A2 for arranging elements of array according to signs -ve to left and positive to right	

	while(left<right) {
		if(arr[left]<0) {
			
			if(arr[right]>=0) {
			left++;
			right--;
			}
			else {
				left++;
			}
			
		}
if(arr[left]>=0) {
			
			if(arr[right]>=0) {
			right--;
			}
			else {
				swap(arr,left,right);
				right--;
				left++;
			}
			
		}
	}
	System.out.println(left);//left stores index of first positive no
	int k=0;
	while(left<arr.length&&k<arr.length && arr[k]<0) {
		swap(arr,left,k);
		left++;
		k+=2;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	
	

	
	
			}
}
