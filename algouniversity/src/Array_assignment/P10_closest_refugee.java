package Array_assignment;

import java.util.Scanner;

public class P10_closest_refugee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
               
		}
		int []count=new int[arr.length+2];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<count.length) {
			count[arr[i]]=1;
			}
		}
		for(int i=1;i<=arr.length+1;i++) {
			if(count[i]==0) {
				System.out.println(i);
				break;
			}
		}
	    }
		
	}


