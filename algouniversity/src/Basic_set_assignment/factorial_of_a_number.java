package Basic_set_assignment;

import java.util.Scanner;

public class factorial_of_a_number {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0) {
    	  int n=sc.nextInt();
System.out.println(    	  factorial(n));    	  
    	  
    	  t--;
      }
	}

}
