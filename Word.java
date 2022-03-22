package phase2;
import java.util.*;
public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		String word=obj.next();
		String arr[]=s.split(" ");
		int w=0;
		for(int i=0;i<arr.length;i++)
		{
			if(word.equals(arr[i]))
			{
				w++;
			}
		}
		System.out.println(arr.length);
		System.out.println(w);
		
	}

}
