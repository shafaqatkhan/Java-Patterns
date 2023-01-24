import java.util.*;

public class CP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Q)1.  Write a program to sum three numbers.
		
		int a=10, b=10, c=10, d;
		d = a+b+c;
		System.out.println("Sum of three number is " + d);
		
// Q)2.  Write a program to calculate CGPA using marks of three subject (outof 100).
	
		int sub1 = 60, sub2 = 50, sub3 = 70;
		int percent = (sub1+sub2+sub3)*100/300;
		double cgpa = percent/9.5;
		System.out.println("CGPA of three subject is " + cgpa);
	
// Q)3.  Write a java program which asks the user to enter his/her nameand greets them with	
//		"hello <name>, have a good day"	text.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.println(name);	
		
// Q)4.  Write a java program to convert Kilometer to Miles.
		
		int km = 16;
		double mile = km*0.62137119;
		System.out.println(mile);
		
// Q)5. Write a java program to detect whether a number entered by the user is integer or not.		
	
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter any number : ");
		double num = sc1.nextDouble();
		
		System.out.println("Saadata TEst");
		
		System.out.println("Shafaqat Khan TEst");
		 
		

		System.out.println("Final TEst");
		
		System.out.println(" TEst");
	
	
	
	}

}
