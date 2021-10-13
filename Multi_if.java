package basics;

import java.util.Scanner;

public class Multi_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("ENTER");
		int a=obj.nextInt();
		System.out.println("ENTER");
		int b=obj.nextInt();
		System.out.println("ENTER");
		int c=obj.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
