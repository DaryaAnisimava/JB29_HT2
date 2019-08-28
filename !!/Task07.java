package by.epam.les03.main;

public class Task07 {
	//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

	public static void main(String[] args) {
		int a, b, c, m, x, y;
		a = 4;
		b = 2;
		c = 8;
		x = -10;
		y = a*x*x + b*x + c;
		m = Math.abs(y);
			System.out.println(m);
	}
}
