package nov17;

import java.util.Scanner;

class Ptr1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter value for n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
