package basics;
import java.util.Scanner;
public class Terinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj = new Scanner(System.in);
	System.out.println("ENTER");
	int a = obj.nextInt();
	System.out.println("ENTER");
	int b = obj.nextInt();
	System.out.println("ENTER");
	int c = obj.nextInt();
	int d;
	d=((a>b && a>c)?a:(b>c)?b:c);
	System.out.println(d);
	
	}

}
