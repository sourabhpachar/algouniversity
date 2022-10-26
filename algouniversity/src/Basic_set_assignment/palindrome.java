package Basic_set_assignment;

import java.util.Scanner;

public class palindrome {
	
	
	static void palindrome(int n) {
		int j=n;
		int r=0;
		int d=0;
		while(n>0) {
			d=n%10;
			n=n/10;
			r=r*10+d;
		}
		System.out.println(r);
	  if(r==j) {
		  System.out.println("Yes");
	  }
	  else {
		  System.out.println("No");
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0) {
    	  int n=sc.nextInt();
    	  palindrome(n);
    	  
    	  
    	  t--;
      }
	}

}
