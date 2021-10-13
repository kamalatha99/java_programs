package basics;

import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("ENTER");
		int age=obj.nextInt();
		System.out.println("ENTER");
		int w=obj.nextInt();
		if(age>18)
		{
			if(w>45)
			{
				System.out.println("Perfect");
			}
			else
			{
				System.out.println("Weight mismatched");
			}
		}
		else
		{
			System.out.println("your age must be greater than 18");
		}

	}

}
