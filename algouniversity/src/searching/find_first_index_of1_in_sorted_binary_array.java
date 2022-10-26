package searching;

public class find_first_index_of1_in_sorted_binary_array {
	public static void input(int[]arr,int n) {
		
	}
public static void main(String[] args) {
	int[]arr= {0,0,0,0,0,1,1,1,1,1,1,1,1};
	int l=0;
	int r=arr.length-1;
	while(l+1<r) {
		int m=l+(r-l)/2;
		if(arr[m]==0) {
			l=m;
		}
		else {
			r=m;
		}
	}
	//this will print position of first 1 
	System.out.println(r);
	//  what if there are all zeros or all are  ones in array then we will add one 0 in starting and one 1 in ending of array this is known as
	//padding then we will relatively find the real position of 0s and 1s
	//there is one other approach in which we can handle this case if we check element at first and last position
	
	//doing padding on the aray
	int[] pad_arr=new int[arr.length+2];
	int n=pad_arr.length;
    pad_arr[0]=0;
    pad_arr[n-1]=1;
    for(int i=0;i<arr.length;i++) {
    	pad_arr[i+1]=arr[i];
    }
	// printing position of first 1
    
    int left=0; 
    int right=n-1;
    while(left+1<right) {
    	int mid=left+(right-left)/2;
    	if(pad_arr[mid]==0) {
    		left=mid;
    	}
    	else {
    		right=mid;
    	}
    			
    }
    if(right==pad_arr.length-1) {
    	System.out.println("no 1s present");
    }
    if(left==0) {
    	System.out.println("no 0s present");
    }
    else {
    	System.out.println("position of last 0s "+(left-1));
    	System.out.println("position of first  1 "+(right-1));
    }
    
    
    
    
    

    
    
}


}