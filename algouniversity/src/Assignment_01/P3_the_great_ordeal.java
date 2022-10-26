//There is a number line and there are three coins placed on it at distinct locations. You are playing a game where you have to move the coins to consecutive positions. For example, having the coins at positions 17,18,19. The initial locations of the three coins a,b,c are provided to you. At any point, two coins cannot occupy the same position and their position must be an integer.
//
//The rules of the game say that of the three coins, at any point, you can only move the leftmost or the rightmost coin. After choosing which coin to move, you must place this coin somewhere between the other two coins. Find the minimum number of moves in which you can place the coins in consecutive positions. Also, find the maximum number of moves after which the coins will end up being in consecutive positions anyway.
//
//Input
//a b c on the first line in that order.
//
//Constraints
//1≤a,b,c≤109
//Output
//On the first line, print the minimum number of moves required.
//
//On the second line, print the maximum number of moves.
//
//Example 1
//Input
//4 7 9
//Output
//1
//2
//Limits
//Time: 1s
//Memory: 256 MB
//







package Assignment_01;

import java.util.Arrays;
import java.util.Scanner;

public class P3_the_great_ordeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int[] arr=new int [3];
      for(int i=0;i<3;i++) {
    	  arr[i]=sc.nextInt();
      }
     Arrays.sort(arr);
      int a=arr[0];
      int b=arr[1];

      int c=arr[2];
      
      int min_diff=Math.min((b-a), (c-b));
      int max_diff=Math.max((b-a), (c-b));
      
      if(min_diff==1 & max_diff==1) {
    	  System.out.println("0");
      }
      else if(min_diff==2) {
    	  System.out.println("1");
      }
      else {
    	  System.out.println("2");
      }
      
      System.out.println(max_diff-1);
      
      
      }
      


}
