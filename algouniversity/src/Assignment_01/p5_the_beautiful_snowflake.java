package Assignment_01;

import java.util.Scanner;

public class p5_the_beautiful_snowflake {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a;
	int  b;
	int[] degree=new int[n+2];
	int[][] arr1=new int[n+2][n+2];
	for(int i=1;i<=m;i++) {
		 a=sc.nextInt();
		 b=sc.nextInt();
		 arr1[a][b]=1;
		 arr1[b][a]=1;
		 degree[a]++;
		 degree[b]++;
		 
		
	}
	
	boolean snowflake=false;
	int[] count=new int[n+2];

	for(int i=1;i<=n;i++) {
		if(degree[i]>1) {
			snowflake=true;
		for(int j=1;j<arr1[i].length;j++) {
			if (arr1[i][j]==1){
			if(degree[j]!=1) {
				 snowflake=false;

			}
			}
		}
		if(snowflake) {
			count[degree[i]]++;
		}
		}
		if(degree[i]==0) {
			count[0]++;
		}
	}
	int beautiful_snowflake_count=0;
	for(int i=0;i<count.length;i++) {
		if(count[i]==1) {
			beautiful_snowflake_count++;
		
		}
		//s11beautiful_snowflake_count++;
	}
	System.out.println(beautiful_snowflake_count);
	
}
}
