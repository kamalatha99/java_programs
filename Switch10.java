package basics;
import java.util.Scanner;
public class Switch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER");
		int a=obj.nextInt();
		System.out.println("ENTER");
		int b=obj.nextInt();
		System.out.println("ENTER");
		int ch=obj.nextInt();
		switch(ch)
		{
		case 1: System.out.println("sum"+(a+b));break;
		case 2: System.out.println("sub"+(a-b));break;
		case 3: System.out.println("mul"+(a*b));break;
		case 4: System.out.println("div"+(a/b));break;
		default : System.out.println("invalid choice");
		}

	}

}
