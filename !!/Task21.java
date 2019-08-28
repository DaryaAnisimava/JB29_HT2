package by.epam.les03.main;

import java.util.Scanner;

public class Task21 {
	//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	    
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		String sx = input.nextLine();
	
		if (sx.equals("Д")) {
			System.out.println("Мне нравятся девочки!");
			
		
		}
	
	
	if (sx.equals("М")) {
		System.out.println("Мне нравятся мальчики!");
		
	}	
			
	
		
		
		
	}
}
