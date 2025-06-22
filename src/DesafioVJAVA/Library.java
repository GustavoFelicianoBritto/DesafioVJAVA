package DesafioVJAVA;
import java.util.Scanner;

public class Library {

	
	
	public static void HorasViagem()
	{
		Scanner input = new Scanner(System.in);
		int dias, horas,total;
		
		System.out.print("Digite quantos dias você viajou: ");
		dias = input.nextInt();
		System.out.print("Digite quantas horas extras você viajou: (0 = nenhuma hora extra) ");
		horas = input.nextInt();
		total = (dias *24)+horas;
		
		
		System.out.printf(horas<=0?"Você viajou por "+ dias +" dias, ou seja, "+ total +" horas.":"Você viajou por "+ dias +" dias e "+ horas+" horas, ou seja, "+ total +" horas.");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Basic()
	{
		
	}
	
	public static void Decision()
	{
		
	}
	
	public static void Repetition()
	{
		
	}
	
	public static void Math()
	{
		
	}
	public static void Vector()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
