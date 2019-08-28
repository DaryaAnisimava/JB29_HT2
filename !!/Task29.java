package by.epam.les03.main;

public class Task29 {
	//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
	public static void main(String[] args) {
		int x1, x2, x3, y1, y2, y3;
		x1 = 2;
		x2 = 3;
		x3 = 1;
		y1 = 2;
		y2 = 3;
		y3 = 1;
		if (((x3-x1)/(x2-x1))==((y3-y1)/(y2-y1)))
			System.out.println("точки лежат на одной прямой");
		else 
			System.out.println("точки не лежат на одной прямой");
			
			
	}
}
