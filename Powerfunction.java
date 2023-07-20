package powerfunction;

import java.util.Scanner;

public class Powerfunction{
	public  static int pow(int A,int B,int C) { 
		if(B==0) {
			return 1;
		}
	
		return (A*pow(A,B-1,C))%C;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		scanner.close();
		System.out.print(pow(A,B,C));
	}
}