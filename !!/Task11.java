package by.epam.les03.main;


public class Task11 {
	//Составить программу, которая определит площадь какого треугольника больше.
	
public static void main(String[] args) {
	int b1, b2, h1, h2;
	double s1, s2;
	b1 = 4;
	b2 = 5;
	h1 = 6;
	h2 = 3;
	s1 = 0.5 * b1 * h1;
	s2 = 0.5 * b2 * h2;
	if (s1>s2)
		System.out.println("Площадь первого треугольника больше");
	else 
		System.out.println("Площадь второго круга больше");
}
	
}
