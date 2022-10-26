package crs_2D_array;

import java.util.* ;

public class toeplitz_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new  Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();

    
     
		int arr[][] = new int[n][m];

		
     

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int row = arr.length;
        int col = arr[0].length;
     
        HashMap<Integer, Integer> map
            = new HashMap<Integer, Integer>();
        boolean check=true;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                int key = i - j;
               
                if (map.containsKey(key))
                {
                    
                    if (map.get(key) != arr[i][j]) {
                        check=false;
                     break;}
                }
               
                else {
                    map.put(i - j, arr[i][j]);
                }
            }
        }
        if(check==true) {
        	System.out.println(1);
	}
        else {
        	System.out.println(0);
        }

	}}
