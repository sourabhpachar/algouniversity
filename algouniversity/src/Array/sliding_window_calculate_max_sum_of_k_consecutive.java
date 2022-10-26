package Array;

import java.util.Scanner;

public class sliding_window_calculate_max_sum_of_k_consecutive {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {3,-1,0,4,5,-2};
	int k=sc.nextInt();
	int sum=0;
	int max=0;
	for(int i=0;i<k;i++) {
		sum+=arr[i];
		
	}
	for(int i=k;i<=arr.length-1;i++) {
		sum=sum-arr[i-k]+arr[i];
	  if(sum>max) {
		  max=sum;
	  }
	}
	System.out.println(max);
}
}
