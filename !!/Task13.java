package by.epam.les03.main;

public class Task13 {
	//Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
	public static void  main(String[] args) {
		int x1, x2, y1, y2;
		double a, b;
		x1 = 1;
		x2 = 3;
		y1 = 5;
		y2 = -3;
		a = Math.sqrt(x1 * x1 + y1 * y1);
		b = Math.sqrt(x2 *x2 + y2 * y2);
		if (a<b)
			System.out.println("точка А находится ближе к началу координат");
		if (a>b)
			System.out.println("точка B находится ближе к началу координат");
		if (a==b)
			System.out.println("точка А и В находятся на одинаковом расстоянии от начала координат ");
}
}