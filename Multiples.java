package basics;

import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj =new Scanner(System.in);
		int r1=obj.nextInt();
		int r2=obj.nextInt();
		for(int i=r1;i<=r2;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
			
		}
		
		
		
		
		

	}

}
