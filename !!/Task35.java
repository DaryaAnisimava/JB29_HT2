package by.epam.les03.main;
import java.util.Scanner;
public class Task35 {
	
	//Вычислить число и месяц в невисокосном году по номеру дня.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] months; // массив чисел дней в месяце
		int day; // День в месяце
		int n; // День с начала года
		int s; // Число дней до начала текущего месяца
		int i; //  Счетчик цикла
	
		  System.out.println("Введите номер дня");
		  n = input.nextInt();
		  months = new int[365];
		  for (i= 1; i<= 12; i++) {
			    if (i==2) 
			      months[i] = 28;
			    if ((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)) 
				      months[i] = 31;
			    if ((i==4) ||(i==6)||(i==9)||(i==11)) 
				      months[i] =30; }
		  
		      
			      
		
		
		 if ((n < 1) ||(n > 365))
	        System.out.println("Ошибочная дата");
	      else {
	      
	      
	    	   
	    	  // Проход по массиву и получения месяца и дня
	    	      s =0;
	    	      i =1;
	    	      while (n>s+months[i]) // если день не в текущем месяце
	    	        {
	    	          s= s+months[i];
	    	          i= i+1;
	    	        }
	    	      day =  n - s;
	    	      System.out.println("Число: "+ day+ "; месяц:"+ i);
	    	        
	    	    
	      		}
		  
}	
}