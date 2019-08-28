package by.epam.les03.main;

public class Task16 {
	//На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
	public static void main(String[] args) {
		int x, y;
		x = 0;
		y = 0;
		if ((x==0) && (y==0)) 
			System.out.println("точка находится в начале координат");
		if ((x==0) && (y!=0))
			System.out.println("точка находится на оси У");
		if ((x!=0)&&(y==0)) 
			System.out.println("точка находится на оси Х");
		if ((x>0)&&(y>0))
			System.out.println("точка находится в I координатном угле");
		if((x<0)&&(y>0))
			System.out.println("точка находится во II координатом угле");
		if ((x<0) && (y<0))
			System.out.println("точка находится в III координатном угле");
		if ((x>0) && (y<0))
		System.out.println("точка находится в IV координатном угле");
	
	}

}
