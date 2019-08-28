package by.epam.les03.main;

public class Task26 {
	//Написать программу нахождения суммы большего и меньшего из трех чисел.
	public static void main(String[] args) {
		int a, b, c, min, max;
		a = 5;
		b =-34;
		c =-92;
		min = a;
		max = a;
		
		  if (b<min)min=b;
		  if (b>max) max=b;
		  if (c<min) min=c;
		  if (c>max) max=c;
		  System.out.println("max=" + max);
		  System.out.println("min=" + min);
	}

}
