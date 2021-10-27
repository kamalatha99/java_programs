package basics;

import java.util.Scanner;
public class Sum_count_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, c=0;
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			c++;
			num=num/10;
		}
		System.out.println(sum+" "+c);
	}

}
