package Basic_set_assignment;

import java.util.Scanner;

public class reverse_a_number {
	public static void reverse(int n) {
		
	    	 
	    	   int r=0;
	    	   int d;
	    	   while(n>0) {
	    		  d=n%10;
	    		  n=n/10;
	    		  r=r*10+d;
	    	   }
	    	   System.out.println(r);
	       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t>0) {
       int n=sc.nextInt();
       reverse(n);
       t--;
       }
       
	}

}
