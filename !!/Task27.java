package by.epam.les03.main;

public class Task27 {
	//Найти max{min(a, b), min(c, d)}.
	public static void main(String[] args) {
		int a, b, c, d, min1, min2, max;
		a =-100;
		b=37;
		c=0;
		d=-99;
		min1 = Math.min(a, b);
		min2 = Math.min(c, d);
		max = Math.max(min1, min2);
		System.out.println("max=" + max);
	}

}
