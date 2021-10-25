package basics;

public class Lineformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for(int j=65;j<=69;j++)
			{
				for(int i=65;i<=j;i++)
					System.out.print((char)j+" ");
				System.out.println();
			}
			System.out.println("-----new-----");
			for(int i=1;i<=5;i++)//5 rows
			{
				for(int j=5;j>=i;j--)//5 columns decreases to i
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			System.out.println("-----new-----");
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("-----new-----");
		

	}

}
