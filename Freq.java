package phase2;
import java.util.*;
public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int a[]=new int[n];
		int f[]=new int[n];
		int visit=-1;
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=visit;
				}
			}
			if(f[i]!=visit)
			{
				f[i]=c;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"-->"+f[i]);
		}
	}

}
