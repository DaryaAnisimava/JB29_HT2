package by.epam.les03.main;

public class Task15 {
	//Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
	public static void main(String[] args) {
		double x, y, x1, y1, x2, y2;
		x = 23.87;
		y = -68.85;
		if (x<y) {
			x1 = (x+y)/2;
			y1 = 2 * x *y;
			System.out.println(x1);
			System.out.println(y1);
		}
		if (x>y) {
			x2 = 2 * x * y;
			y2 =  (x+y)/2;
			System.out.println(x2);
			System.out.println(y2);
		}
	}

}
