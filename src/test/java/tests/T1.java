package tests;

public class T1 {
	public static void main(String[] args) {
		T1 t = new T1();
		t.checkPrime(1);
		t.checkPrime(2);;
		t.checkPrime(3);;
		t.checkPrime(4);;
		t.checkPrime(7);
		t.swaping("java","selenium");
		
	}
	
	// 10. Check prime number or not a prime number
		public void checkPrime(int a) {
			int num = a;
			boolean flag = false;
			if (num <= 1) {
				flag = true;
			}
			for (int i = 2; i <= num / 2; i++) {
				// condition for non-prime number
				if (num % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " is not a prime number.");
		}

		public void swaping(String a, String b) {
			a=a+b;
			b=a.substring(0,a.length()-b.length());
			a=a.substring(b.length());
			System.out.println("String a is: "+a);
			System.out.println("String b is: "+b);
		}
}
