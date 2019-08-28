package by.epam.les03.main;
import java.util.Scanner;
public class Task23 {
	//Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите день");
		
	
		int d = input.nextInt();
		System.out.println("Введите месяц");
		int m = input.nextInt();
		
		
	
	
	if ((m>=1)&&(m<=12))
			System.out.println("Месяц верный");
		else 
			System.out.println("Месяц неверный");
	
		
		switch (m) {
		case 1:
	
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if((d>=1)&&(d<=31)) {
			System.out.println("День верный");}
			else {
				System.out.println("День неверный");}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if((d>=1)&&(d<=30)) {
				System.out.println("День верный");}
				else {
					System.out.println("День неверный");}
			break;
		case 2:
			if ((d>=1)&&(d<=28)) {
				System.out.println("День верный");}
			if (d==29)		{
					System.out.println("День верный, если годевисокосный");}
			if(d>29) {
				System.out.println("День неверный");}
			break;
			
		}
		
		
}
}