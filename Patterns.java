package basics;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.print("*"+" ");
		}
		System.out.println("\n------new-------");
		for(int i=65;i<=69;i++)
		{
			for(int j=5;j>=1;j--)
			System.out.print((char)i+" ");
		
		System.out.println();
		}
		System.out.println("-----another task-----");
		for(int i=1;i<=5;i++)
		{
			for(int j=65;j<=69;j++)
			System.out.print((char)j+" ");
		
		System.out.println();
		}
		System.out.println("----another task----");
		for(int i=69;i>=65;i--)
		{
			for(int j=1;j<=5;j++)
			System.out.print((char)i+" ");
		
		System.out.println();
		}
		System.out.println("-----another task-----");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*"+" ");
		System.out.println();
		}
	
		System.out.println("---------new----------");
		
			for(int j=65;j<=69;j++)
			{
				for(int i=65;i<=j;i++)
				System.out.print((char)i+" ");
			
			System.out.println();
			}

	}

}
