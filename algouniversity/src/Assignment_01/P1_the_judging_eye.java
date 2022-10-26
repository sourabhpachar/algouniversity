//You are on a number where your position is denoted by x. You want to travel to another point on the number line y. Normally, the distance to y is simply |y−x|. However, you know there is a teleporter on the number line denoted by two positions a and b. You can teleport from a directly to b or from b directly to a. Teleporting counts as travelling 0 distance. What is the minimum distance you must travel to get from x to y.
//
//Input
//One line with four space-separated integers x y a b in that order.
//
//Constraints
//1≤x,y,a,b≤100
//Output
//One integer --- the minimum distance you must travel.
//
//Example 1
//Input
//3 10 8 2
//Output
//3
//Limits
//Time: 1s
//Memory: 256 MB




package Assignment_01;
import java.util.*;
import java.lang.*;

public class P1_the_judging_eye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int d=0;
      int  k=0;
      int l=0;
      
      
      if(x<y) {
    	  if(a<b) {
    		  k=Math.abs(x-a);
    		  l=Math.abs(y-b);
    		 
    	  }
    	  else {
    		  k=Math.abs(x-b);
    		  l=Math.abs(y-a);
    	  }
      }
      else {
    	  if(a<b) {
    		  k=Math.abs(x-b);
    		  l=Math.abs(y-a);
    	  }
    	  else {
    		  k=Math.abs(x-a);
    		  l=Math.abs(y-b);
    	  }
      }
      if((k+l)<Math.abs(x-y))
      {
    	  System.out.println(k+l);
      }
      else {
    	  System.out.println(Math.abs(x-y));
      }
	}

}
