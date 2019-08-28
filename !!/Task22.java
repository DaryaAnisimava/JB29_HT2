package by.epam.les03.main;

public class Task22 {
	//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
	public static void main(String[] args){
		int x, y, a, b;
		x = 7;
		y = -6;
		a = Math.max(x,y);
		b = Math.min(x, y);
		x = a;
		y = b;
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		
	}

}
