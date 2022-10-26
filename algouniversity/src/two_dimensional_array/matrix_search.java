package two_dimensional_array;

import java.util.Scanner;

public class matrix_search {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int q=sc.nextInt();
	long[][]arr=new long[n][m];
	long[] qarr=new long[q];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextLong();
			
		}
	}
	for(int i=0;i<q;i++) {
		qarr[i]=sc.nextInt();
		int col=m-1;
		int row=0;
		while(col>=0&&row<n) {
			if(arr[row][col]==qarr[i]) {
				System.out.println(row+" "+col);
				break;
			}
			else	if(arr[row][col]>qarr[i]) {
				col--;
			}
			else {
				row++;
			}
		}
		}
	}
}

