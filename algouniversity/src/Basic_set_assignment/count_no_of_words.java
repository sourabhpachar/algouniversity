package Basic_set_assignment;

import java.util.Scanner;

public class count_no_of_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
    int count=0;
     for(int i=0;i<str.length();i++ ) {
    	 if((str.charAt(i)==' ')) {
    		 count++;
    	 }

     }
     System.out.println(count+1);
     
	}

}
