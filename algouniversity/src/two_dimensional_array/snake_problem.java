package two_dimensional_array;

import java.util.Scanner;

public class snake_problem {
	public static void snake_traversal(int[][]mat) {
	    int i=0;
	    int n=mat.length;
	    int m=mat[0].length;
	    
	    for(i=0;i<n;i++) {
	    	if(i%2!=0) {
	    		for(int j=m-1;j>=0;j--) {
	    			System.out.print(mat[i][j]+" ");
	    		}
	    		//System.out.println();
	    	}
	    	else {
	    		for(int j=0;j<m;j++) {
	    			System.out.print(mat[i][j]+" ");
	    		}
	    		//System.out.println();
	    	}
	    }
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[][] mat= { {1, 2, 3},

            {4, 5, 6},

            {7, 8, 9}};
	
	snake_traversal(mat);
}
}
