package by.epam.les03.main;

public class Task19 {
	//Подсчитать количество положительных среди чисел а, b, с.
	public static void main(String[] args) {
		double a, b, c;
		int s;
		a =-1.5;
		b = -0.6;
		c =-5;
		s = 0;
		if (a>0)
			s = s+1;
		if (b>0)
			s =s+1;
		if (c>0)
			s = s + 1;
		System.out.println("количество положительных чисел:" + s);
	}

}
