package by.epam.les03.main;

public class Task40 {
	//Вычислить значение функции:
		public static void main(String[] args) {
			double x = 13.5;
			double y;
			if (x<=13) {
				y = -x * x *x + 9;
				System.out.print("y=" + y);
			}else {
				y = -3/(x + 1);
				System.out.printf("y=%.4f",y);
			}
				
		}

}
