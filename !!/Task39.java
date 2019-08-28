package by.epam.les03.main;

public class Task39 {
	//Вычислить значение функции:
		public static void main(String[] args) {
			double x = 9;
			double y;
			if (x>=8) {
				y = -x * x + x - 9;
				System.out.print("y=" + y);
			}else {
				y = 1/(Math.pow(x, 4) - 6);
				System.out.printf("y=%.4f",y);
			}
				
		}

}
