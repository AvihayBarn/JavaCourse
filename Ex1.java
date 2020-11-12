package HomeQuests;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the first number for max prime GCD: ");
			int a=s.nextInt();
			System.out.println();
			System.out.print("Enter the second number for max prime GCD: ");
			int b=s.nextInt();
			System.out.println();
			System.out.println("Computes the GPCD("+a+","+b+") =");
			System.out.println();
			GPCD(a,b);
		
		
			
	}
	
	//GCD function:
	public static void GPCD(int a,int b) {
		int gcd;
		if(a>b) gcd=GCD(a,b);
		else gcd=GCD(b,a);
		
		if(isPrime(gcd)) {
			System.out.print("Max Prime Common Divider:"+gcd);
		}
		else {
			int temp=0;
			for(int i=2;i<=gcd-1;i++) {
				if(a%i==0 && b%i==0 && isPrime(i)) temp=i;
			}
			System.out.print("Max Prime Common Divider:"+temp);
		}
	}
	public static int GCD(int a,int b) {
		if(b==0) return a;
		else return GCD(b,a%b);
	}
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) count++;
		}
		if(count==1) return true;
		else return false;
	}
	
}
