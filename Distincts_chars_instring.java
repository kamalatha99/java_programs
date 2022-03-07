package phase2;
import java.util.*;
public class Distincts_chars_instring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int flag=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag=1;
					break;
					
					
				}
				
			}
			if(flag==0)
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
