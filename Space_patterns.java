package basics;

public class Space_patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)//5 rows
		{
			for(int j=5;j>i;j--)//spaces 4 3 2 1 0
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)//* print 1 2 3 4 5
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----new-----");
		for(int i=1;i<=5;i++)//5 rows
		{
			for(int j=5;j>i;j--)//4spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}

}
