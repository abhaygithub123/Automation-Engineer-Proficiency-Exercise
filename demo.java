package programs;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("upper case");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("lower case");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("special character");
		}


	}

}
