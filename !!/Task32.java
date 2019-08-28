package by.epam.les03.main;

public class Task32 {
	//Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
	public static void main(String[] args) {
		double a, b, c;
		a =-99;
		b =-20;
		c=110;
		
		if (((a+b)>0) || ((a+c)>0) ||((b+c)>0)) 
			System.out.println("сумма положительная");
			else
				System.out.println("сумма неположительная");	
			
		}
			
			
	
}
