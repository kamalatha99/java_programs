package basics;

import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("--------------------------");
		int i=1;
		do{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		System.out.println("--------------------------");
		int y;
		do{
			System.out.println("enter stu_name");
			String name=obj.next();
			System.out.println("enter roll_num");
			int r=obj.nextInt();
			System.out.println("do u want to continue(y:1/n:0)");
		    y=obj.nextInt();
			}
		while(y==1);
		System.out.println("--------method2---------");
		String z="y";
		do{
			System.out.println("enter stu_name");
			String n=obj.next();
			System.out.println("enter roll_num");
			int roll=obj.nextInt();
			System.out.println("do u want to continue(y/n)");
		    z=obj.next();
			}
		while(z.equals("y"));
		

	}

}
