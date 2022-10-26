package Array;

import java.util.Scanner;

public class prefix_sum {
// we are given different queries with l and r we havve to return sum of all the array elements from l to r
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        int []prefix_sum=new int [arr.length];
        prefix_sum[0]=arr[0];
        if(arr.length>0) {
        for(int i=1;i<arr.length;i++) {
        	prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }
        }
        while(q>0) {
          int l=sc.nextInt();
          int r=sc.nextInt();
          
          int ans=prefix_sum[r]-prefix_sum[l-1];
        	System.out.println(ans);
        	
        	
        	q--;
        }
	}

}
