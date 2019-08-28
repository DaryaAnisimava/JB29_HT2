package by.epam.les03.main;

public class Task25 {
	//Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.
	public static void main(String[] args) {
	int t =75;
	if (t>60)
		System.out.println("Пожароопасная ситуация");
	else 
		System.out.println("Все ок");

}
}