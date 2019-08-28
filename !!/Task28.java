package by.epam.les03.main;

public class Task28 {
	//Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
	public static void main(String[] args) {
		int a, b, c, d, max;
		a = 10;
		b =-30;
		c =-40;
		d =100;
		int k = d - a;
		int l = d - b;
		int m = d - c;
		
		if (a==d)
			System.out.println("a = d");
		if (b==d)
			System.out.println("b = d");
		if (c==d)
			System.out.println("c = d");
		if ((c!=d)&&(b!=d)&&(a!=d)) {
			int max1 = Math.max(k, l);
			int max2 = Math.max(l, m);
			max = Math.max(max1, max2);
			System.out.println("max = " + max);
		}
			
	}
}
