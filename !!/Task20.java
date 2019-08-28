package by.epam.les03.main;

public class Task20 {
	//Определить, делителем каких чисел а, b, с является число k.
	public static void main(String[] args) {
		int a, b, c, k;
		a =-5;
		b = 3;
		c = 5;
	    k = 2;
		if (a%k==0)
			System.out.println("k делитель числа а");
		if (b%k==0)
			System.out.println("k делитель числа b");
		if (c%k==0)
			System.out.println("k делитель числа c");
		if ((a%k!=0)&&(b%k!=0)&&(c%k!=0))
			System.out.println("k не является делителем чисел a, b,c");
	}


}
