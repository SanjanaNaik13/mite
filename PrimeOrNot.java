package labprograms;

public class PrimeOrNot {

	public static boolean isPrime(int x) {
		if (x<= 0)
			return false;
		else if (x==1)
			return false;
		else if (x > 3 && (x%2==0 || x % 3 == 0))
			return false;
		else {
			for (int i = 5; i<=Math.sqrt(x);i+=6)
				if (x%i==0 || x % (i+2)==0)
					return false;
			return true;
		}
	}
	
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		
	}

}
