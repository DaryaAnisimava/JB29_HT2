package by.epam.les03.main;

public class Task14 {
	//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
	public static void main(String[] args) {
		double a, b;
		a = 35;
		b = 80;
		if ((a+ b)<= 90)
			System.out.println("треугольник существует");
		if ((a + b)== 90)
			System.out.println("треугольник прямоугольный");
	
		if ((a+ b)> 90)
			System.out.println("треугольник не существует");
			
		
	}

}
