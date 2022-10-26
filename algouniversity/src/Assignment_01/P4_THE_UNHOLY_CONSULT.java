//There is a road of length 100 km which you travelled. There are different speed limits for different segments of the road. There are N such segments. And if one were to describe your driving, you drove in M segments. In each segment, you maintained a constant speed. You want to find out the maximum amount you went over the speed limit.
//
//Input
//Two integers N M on the first line.
//
//N lines follow, where the i-th line of these describes the i-th segment. Each line has two integers, the first one describes the length of the segment and the second describes the maximum speed limit of this segment.
//
//M lines follow, where the j-th line of these describes the j-th segment. Each line has two integers, the first one describes the length of the segment and the second describes the speed at which you travelled in this segment.
//
//Constraints
//The lengths of all N segements add up to 100.
//
//The lengths of all M segments add up to 100.
//
//All lengths are positive integers.
//
//The speed limit of any segment is between 1 and 100 inclusive.
//
//Your speed in any segment is between 1 and 100 inclusive.
//
//Output
//One integer --- the maximum amount you went over the speed limit. If you never went over the speed limit, output 0.
//
//Example 1
//Input
//3 3
//40 75
//50 35
//10 45
//40 76
//20 30
//40 40
//Output
//5
//Example Explanation
//In this example, the road contains three segments (40 km at 75 km per hour, followed by 50 km at 35 km per hour, then 10 km at 45 km per hour). You drive for three segments (40 km at 76 km per hour, 20 km at 30 km per hour, and 40 km at 40 km per hour). During the first segment, you are slightly over the speed limit by 1km / hr, but the last segment is the worst difference, during part of which you are 5 km per hour over the speed limit (from segment 60 to 90). The correct answer is therefore 5
//Limits
//Time: 1s
//Memory: 256 MB
//
//






package Assignment_01;

import java.util.Scanner;

public class P4_THE_UNHOLY_CONSULT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [] arrn=new int[100];
      int [] arrm=new int[100];
      int support=0;
      for(int i=0;i<n;i++) {
    	  int k=sc.nextInt();
    	  int l=sc.nextInt();
    	  for(int j=support;j<(k+support);j++) {
    		 arrn[j]= l;
    	  }
    	  support+=k;
      }
     support=0;
     for(int i=0;i<m;i++) {
   	  int x=sc.nextInt();
   	  int y=sc.nextInt();
   	  for(int j=support;j<(x+support);j++) {
   		 arrm[j]= y;
   	  }
   	  support+=x;
     }
     int max_diff=0;
     for(int i=0;i<100;i++) {
    	 if((arrm[i]-arrn[i])>max_diff) {
    		 max_diff=arrm[i]-arrn[i];
    	 }
     }
     System.out.println(max_diff);
	}

}
