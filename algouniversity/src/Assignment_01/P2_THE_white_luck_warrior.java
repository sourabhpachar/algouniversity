//
//
//You are given two rectangles and you must find the area of the smallest square that contains these two rectangles within it.
//
//(x11,y11) represents the coordinates of the lower-left corner of the first rectangle and (x12,y12) represents its upper-right corner.
//
//Similarly, (x21,y21) represents the coordinates of the lower-left corner of the second rectangle and (x22,y22) represents its upper-right corner.
//
//Input
//x11 y11 x12 y12 on the first line in that order.
//
//x21 y21 x22 y22 on the second line in that order.
//
//Constraints
//0≤x11≤x12≤10
//0≤y11≤y12≤10
//0≤x21≤x22≤10
//0≤y21≤y22≤10
//Output
//One integer --- the area of the smallest square that contains both the rectangles.
//
//Example 1
//Input
//6 6 8 8
//1 8 4 9
//Output
//49
//Limits
//Time: 1s
//Memory: 256 MB



package Assignment_01;

import java.util.Scanner;

public class P2_THE_white_luck_warrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int x11=sc.nextInt();
          int y11=sc.nextInt();
          int x12=sc.nextInt();
          int y12=sc.nextInt();
          int x21=sc.nextInt();
          int y21=sc.nextInt();
          int x22=sc.nextInt();
          int y22=sc.nextInt();
          
          int x_min=Math.min(x11, x21);
          int y_min=Math.min(y11, y21);
          int x_max=Math.max(x12,x22);
          int y_max=Math.max(y12, y22);
          
          int diff_x=Math.abs(x_max-x_min);
          int diff_y=Math.abs(y_max-y_min);
          
          int side=Math.max(diff_x, diff_y);
          
          System.out.println(side*side);
          
	}

}
