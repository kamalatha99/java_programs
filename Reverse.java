package basics;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int q,r,rev=0;
		System.out.println("enter num:");
		int num=obj.nextInt();
		while(num!=0)
		{
			q=num/10;
			r=num%10;
			rev=rev*10+r;
			num=q;
		}
		System.out.println(rev);

	}

}
