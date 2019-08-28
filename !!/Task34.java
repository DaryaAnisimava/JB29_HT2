package by.epam.les03.main;
import java.util.Scanner;

public class Task34 {
	public static void main(String[] args) {
		//Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
		Scanner input = new Scanner(System.in);
		double x, y, z;
		System.out.println("Введите cтоимость книги");
		x = input.nextDouble();
		System.out.println("Внесено денег:");
		y = input.nextDouble();
		if (x==y)
			System.out.println("спасибо");
		if (y>x) {
			z=y-x;
			System.out.println("возьмите сдачу");
			System.out.printf("сдача= %.2f", z);
		}
		if (x>y) {
			z=x-y;
			System.out.println("недостаточно денег");
			System.out.printf("размер недостающей суммы= %.2f", z);
		}
}
}