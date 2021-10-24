package basics;

import java.util.Scanner;
public class Input_accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int y=1;
		while(y==1)
		{
			System.out.println("enter s.no:");
			int s=obj.nextInt();
			System.out.println("enter student name:");
			String n=obj.next();
			System.out.println("do you want to continue:0/1:");
			int x=obj.nextInt();
			y=x; 
			
		}

	}

}
