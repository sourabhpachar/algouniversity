package Array;

import java.util.Scanner;

public class max_product_of_k_consecutive_elements_sliding_window {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	int[] arr= {3,-1,0,4,5,-2,-1};
	int curr_prod=1;
	int max_prod=0;
	for(int i=0;i<k;i++) {
		curr_prod*=arr[i];
	}
	max_prod=Math.max(max_prod, curr_prod);

    for(int i=k;i<arr.length;i++) {
    	int coming_element=arr[i];
    	int leaving_element=arr[i-k];
    	
    	if(coming_element==0) {
    		i=i+k;
    		curr_prod=0;
    	}
    	curr_prod=curr_prod/leaving_element;
    	curr_prod=curr_prod*coming_element;
    	max_prod=Math.max(max_prod, curr_prod);
    	
    }
    System.out.println(max_prod);
}
}
