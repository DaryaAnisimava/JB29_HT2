package by.epam.les03.main;

public class Task08 {
	//Составить программу нахождения наименьшего из квадратов двух чисел а и b.
	public static void main(String[] args) {
		int a, b, q1, q2, m;
		a = 3;
		b = -25;
		q1 = a * a;
		q2 = b * b;
		m = Math.min(q1, q2);
		System.out.println(m);
		
	}
}
