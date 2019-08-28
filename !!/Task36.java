package by.epam.les03.main;

public class Task36 {
	//Вычислить значение функции:
	public static void main(String[] args) {
		double x = 2.5;
		double y;
		if (x<=3) {
			y = x * x - 3*x + 9;
			System.out.print("y=" + y);
		}else {
			y = 1/(x*x*x + 6);
			System.out.printf("y=%.4f",y);
		}
			
	}

}
