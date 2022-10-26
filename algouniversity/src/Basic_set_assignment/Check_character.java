package Basic_set_assignment;

import java.util.Scanner;
import java.lang.*;

public class Check_character {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	if(Character.isUpperCase(c)) {
		System.out.println("upper");
	}
	else if(Character.isLowerCase(c)) {
		System.out.println("lower");
	}
	else {
		System.out.println("error");
	}
}
}
