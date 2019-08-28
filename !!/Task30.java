package by.epam.les03.main;

public class Task30 {
	//Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
	public static void main(String[] args) {
		double a, b, c;
		a = 10.54;
		b =-56.08;
		c = 0.07;
		if ((a > b)&&(b>c)&&(a>c)) {
			double a1 = 2*a;
			double b1 = 2*b;
			double c1 = 2*c;
			System.out.println("a=" + a1);
			System.out.println("b=" + b1);
			System.out.println("c=" + c1);
			
		}	else {
			double a1= Math.abs(a);
			double b1= Math.abs(b);
			double c1= Math.abs(c);
			System.out.println("a=" + a1);
			System.out.println("b=" + b1);
			System.out.println("c=" + c1);
		}
	}
}
