package mani;
import java.util.Scanner;
public class mani_4 {
		public static void main(String[] args) {
			
			char c1,c2;
			Scanner sc=new Scanner(System.in);
			c1=sc.next().charAt(0);
			c2=sc.next().charAt(0);
	        if(c1>c2)
	        {
	        	System.out.println(c2+","+c1);
	        }
	        else
	        {
	        	System.out.println(c1+","+c2);
	        }
		

	}

}