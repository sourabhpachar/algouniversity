package Array_assignment;

import java.util.Arrays;
import java.util.Scanner;

//Input
//13 11
//4 3 4 4 9 12 20 14 2 12 12 11 6

import java.util.*;
public class triplet_sum{

public static void tri(int []arr,int[]arr1 ,int k) {
		
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int[]arr=new int[n];
	int[]arr1=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		arr1[i]=arr[i];

	}
	if(n<3){
	    			System.out.println(-1);
return;
	}
	Arrays.sort(arr);
	int triplet_sum=0;
		int a=0;
		int b=0;
		int c=0;
		boolean match=false;
		for(int i=0;i<arr.length-2;i++) {
		      int l=i+1;
		      int r=arr.length-1;
		      while(l<r) {
		    	  if((arr[i]+arr[l]+arr[r])==k) {
		    		  a=arr[i];
		    		  b=arr[l];
		    		  c=arr[r];
		    		  
		    		  match=true;
		    		   break;
		    	  }
		    	  else if((arr[i]+arr[l]+arr[r])<k){
		    		  l++;
		    	  }
		    	  else {
		    		  r--;
		    	  }
		      }
		      if(match==true) {
		    	  break;
		      }
		}
		if(match==false) {
			System.out.println(-1);
			

		}
		else {
		    boolean match_b=false;
		     boolean match_a=false;
		      boolean match_c=false;
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==a&&match_a==false) {
					System.out.print((i+1)+"");
					match_a=true;
				}
				if(arr1[i]==b&&match_b==false)
				{
				    					System.out.print((i+1)+"");
match_b=true;
				}
				if(arr1[i]==c&&match_c==false)
				{
				    					System.out.print((i+1)+"");
match_c=true;
				}
			}
			
		}
}
}

