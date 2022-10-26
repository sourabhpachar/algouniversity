package Array;

import java.util.Arrays;
import java.util.Scanner;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []arr=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       int t_sum=sc.nextInt();
       Arrays.sort(arr);
       int l=0;
       int h=arr.length-1;
       while(l<h) {
    	   if((arr[l]+arr[h])>t_sum) {
    		   h--;
    	   }
    	   else if((arr[l]+arr[h])<t_sum) {
    		   l++;
    	   }
    	   else {
    		   System.out.println(l+"  "+h);
    		   break;
    	   }
    		   
       }
	}
	

}
