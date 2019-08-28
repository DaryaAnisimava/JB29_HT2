package by.epam.les03.main;

public class Task31 {
	public static void main(String[] args) {
		//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
		double x, y, z, a, b;
		x = 1.2;
		y = 4;
		z = 3.5;
		a = 3.3;
		b = 4;
		if (((x<a)&&(y<b)) || ((x<a)&&(z<b)) || ((x<b)&&(y<a)) || ((x<b)&&(z<a))||((y<a)&&(z<b))||((z<a)&&(y<b)))
		System.out.println("пройдет");
		else 
			System.out.println(" не пройдет");
	}

}
