package by.epam.les03.main;

public class Task12 {
	//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
	public static void main(String[] args) {
		double a, b, c, a1, b1, c1;
		a = -1.34;
		b = 3.87;
		c = -7;
		if (a>=0) {
			a1 = a * a;
			System.out.println(a1);
			} else {
			a1 = Math.pow(a, 4); 
			System.out.println(a1);
			}
		if (b>=0) {
			b1 = b * b;
			System.out.println(b1);
			} else {
			b1 = Math.pow(b, 4); 
			System.out.println(b1);
			}
		if (c>=0) {
			c1 = c * c;
			System.out.println(c1);
			} else {
			c1 = Math.pow(c, 4); 
			System.out.println(c1);
			}
		
	}
	

}
