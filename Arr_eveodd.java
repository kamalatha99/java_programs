package basics;

import java.util.Scanner;
public class Arr_eveodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				System.out.println(a[i]+"even");
			}
			else{
				System.out.println(a[i]+"odd");
			}
		}

	}

}
