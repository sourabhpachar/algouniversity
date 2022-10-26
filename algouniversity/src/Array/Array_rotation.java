package Array;

import java.util.Scanner;

public class Array_rotation {
	public static void printt(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reverse(int []arr,int l,int r) {
		 l=l-1;
		 r=r-1;
		while(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
	      System.out.println("inside reverse");

	}
	public static void arr_rotate_reverse(int []arr,int d) {
	      System.out.println("inside rotate function");
	      d=d%arr.length;

	      if(d<0) {
	    	  d=Math.abs(arr.length+d);;
	      }
           
		reverse(arr,1,d);
		reverse(arr,d+1,arr.length);
		reverse(arr,1,arr.length);
	      System.out.println("inside rotate function");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr= {1,2,3,4,5,6,7};
      Scanner sc=new Scanner(System.in);
      int d=sc.nextInt();
      
      System.out.println("before rotate");
     arr_rotate_reverse(arr,d);
      System.out.println("after rotate");

      printt(arr);
      
	}

}
