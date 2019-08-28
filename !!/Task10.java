package by.epam.les03.main;
import static java.lang.Math.PI;
public class Task10 {
	//Составить программу, которая определит площадь какого круга меньше.
	public static void main(String[] args) {
		int r1, r2;
		double s1, s2;
		r1 = 4;
		r2 = 5;
		s1 = PI * r1 * r1;
		s2 = PI * r2 * r2;
		if (s1<s2)
			System.out.println("Площадь первого круга меньше");
		else 
			System.out.println("Площадь второго круга меньше");
		
		
	}

}
