package by.epam.les03.main;

public class Task17 {
	//Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
	public static void main(String[] args) {
		int m, n, m1, n1;
		m = -5;
		n = -5;
		if (m!=n) {
			m1 = Math.max(m, n);
			n1 = Math.max(m, n);
			System.out.println(m1);
			System.out.println(n1);
		} else {
			m1 = 0;
			n1 = 0;
			System.out.println(m1);
			System.out.println(n1);
			
		}
		
	}

}
