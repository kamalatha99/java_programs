package basics;

import java.util.Scanner;

public class Arr_eveodd_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter n:");
		int n=obj.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else{
				odd++;
			}
			
		}
		System.out.println("even_count"+even+" "+"odd_count"+odd);

	}

}
