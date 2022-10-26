package Array_assignment;

import java.util.Scanner;

public class square_of_sorted_array {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int []arr=new int[n];
		int []arr2=new int[n];
		for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
		}
		int l=0;
		int k=arr.length-1;
		int h=arr.length-1;
		while(l<=h) {
			if(Math.abs(arr[l])>Math.abs(arr[h])) {
				arr2[k]=arr[l]*arr[l];
				k--;
				l++;
			}
			 else if(Math.abs(arr[l])==Math.abs(arr[h])&&(l!=h)) {
	    		 arr2[k]=arr[l]*arr[l];
	    		 k--;
	    		 arr2[k]=arr[l]*arr[l];
	    		 k--;
	    		 l++;
	    		 h--;
	    		 
	    	 }
	    	 else if((Math.abs(arr[l])==Math.abs(arr[h]))&&(l==h)){
	    		 arr2[k]=arr[h]*arr[h];
	    		 l++;
	    		 h--;
	             k--;
	    	 }
	    	 else {
	    		 arr2[k]=arr[h]*arr[h];
	    		 h--;
	    		 k--;
	    	 }
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}
