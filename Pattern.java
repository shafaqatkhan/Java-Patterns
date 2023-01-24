
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j, n=5, k = 0, sum=0;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
System.out.println();
		
		
		for(i=5; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1;j<=5-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=5; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				k = k+1;
				System.out.print(k);
			}
			System.out.println();
		}
System.out.println();
		
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				sum = i+j;
				if(sum % 2 ==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				System.out.print("");
			}
System.out.println();
		}
		
//Q)Butterflay pattern
//	upper half	
	for(i=1; i<=n; i++) {
		//1st *
		for(j=1; j<=i; j++) {
			System.out.print("*");
		}
		//space
		int space = 2*(n-i);
		for(j=1; j<=space; j++) {
			System.out.print(" ");
		}
		//2nd *
		for(j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
//Lower half		
	for(i=n-1; i>=1; i--) {
		//1st *
		for(j=1; j<=i; j++) {
			System.out.print("*");
		}
		//space
		int space = 2*(n-i);
		for(j=1; j<=space; j++) {
			System.out.print(" ");
		}
		//2nd *
		for(j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}	
		
//solid rhombus	
	for(i=1; i<=n; i++) {
		for(j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(j=1; j<=n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
//Number piramid		
	for(i=1; i<=n; i++){
		for(j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(j=1; j<=i; j++) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

//Palindrom number	
	for(i=1; i<=n; i++) {
		for(j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(j=i; j>=1; j--) {
			System.out.print(j);
		}
		for(j=2; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
	
	
//Dimond star	
	
	for(i=1; i<=n; i++) {
		for(j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(j=1; j<=i; j++) {
			System.out.print("*");
		}
		for(j=2; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=n-1; i>=1; i--) {
		for(j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(j=1; j<=i; j++) {
			System.out.print("*");
		}
		for(j=2; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	}

}
