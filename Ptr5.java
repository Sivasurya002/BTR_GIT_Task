package nov17;

import java.util.Scanner;

class Ptr5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter value for n:");
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
