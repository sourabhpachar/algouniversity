package Array_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class P8_treasure_room_easy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int k;
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr1[i] = arr[i];
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;
		int a = -1;
		int b = -1;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (sum > w) {
				r--;
			} else if (sum < w) {
				l++;
			} else if (sum == w) {
				a = arr[l];
				b = arr[r];
				break;
			}
		}
		if ((a == -1) && (b == -1)) {
			System.out.println(a);
		} else {
			boolean a_fl = false;
			boolean b_fl = false;

			// System.out.println(a+" "+b);
			for (int i = 0; i < arr1.length; i++) {
				
				if (arr1[i] == a && a_fl == false) {
					System.out.println((i + 1) + " ");
					a_fl = true;

				}
				if (arr1[i] == b && b_fl == false) {
					System.out.println((i + 1) + " ");
					b_fl = true;
					;

				}
			}
		}

	}
}
