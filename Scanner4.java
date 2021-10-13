package basics;

import java.util.Scanner;
public class Scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter empno:");
		int empno =obj.nextInt();
		System.out.println("enter empname:");
		String empname =obj.next();
		System.out.println("enter age:");
		int age =obj.nextInt();
		System.out.println("enter salary:");
		float sal=obj.nextFloat();
		System.out.println("emp_no="+empno+"\nempname="+empname+"\nage="+age+"\nsalary:"+sal);
		
		

	}

}
