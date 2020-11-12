

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		if(args[0]!=null) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			GPCD(a,b);
		}
		else {
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			GPCD(a,b);
		}
	}
	
	//GCD function:
	public static void GPCD(int a,int b) {
		int gcd;
		if(a>b) gcd=GCD(a,b);
		else gcd=GCD(b,a);
		
		if(isPrime(gcd)) System.out.println(gcd);
		else {
			int temp=0;
			for(int i=2;i<=gcd-1;i++) {
				if(a%i==0 && b%i==0 && isPrime(i)) temp=i;
			}
			System.out.println(temp);
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
