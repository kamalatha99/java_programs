package basics;


import java.util.Scanner;
public class Large_digit_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int large=0;
		while(num!=0)
		{
			int r=num%10;
			num=num/10;
			if(r>large)
			{
				large=r;
				r=0;
			}
			
			
		}
		System.out.println(large);
	}

}
