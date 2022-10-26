package Array;

import java.util.Scanner;

public class p7_sphinix_and_range_sum {
	public static void rangesum(int[] arr1, int l, int r) {
		if (l == 0) {
			System.out.println(arr1[r]);
		} else {
			System.out.println(arr1[r] - arr1[l - 1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] arr = new long[n+1];
		long [] arr1 = new long[n+1];
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
			arr1[i]=sum;
		}
	for(int i=0;i<=n;i++) {
		System.out.print(arr1[i]+" ");
	}
		int q = sc.nextInt();
		while (q > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			//rangesum(arr1, l , r );
			System.out.println(arr1[r] - arr1[l - 1]);
			q--;
		}

	}

}
