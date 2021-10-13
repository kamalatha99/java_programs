package basics;

import java.util.Scanner;
public class Circle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter radius of a circle:");
		float r= obj.nextFloat();
		float area=3.14f*r*r;
		float circum=2*3.14f*r;
		System.out.println("area"+area+"\ncircum"+circum);

	}

}
