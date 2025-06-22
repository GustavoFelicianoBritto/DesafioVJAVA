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
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
		System.out.println("\n\nQual opção? \n0 - Sair\n1 - Horas viagem\n");
		option=input.nextInt();
		
		switch (option)
		{
		case 0:
			System.out.println("Voltando");
			break;
		case 1:
			HorasViagem();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
			
		}
		while(option!=0);
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
