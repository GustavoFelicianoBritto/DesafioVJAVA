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
	
	public static void AreaRetangulo()
	{
		//Receber base e altura de um retângulo e mostrar a área.
		Scanner input = new Scanner(System.in);
		double base,altura,area;
		
		System.out.println("Digite a base do retângulo: ");
		base = input.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		altura = input.nextDouble();
		
		area = base*altura;
		
		System.out.printf("O retângulo de base %.1f metros e altura %.1f metros tem área de %.1f",base,altura,area);
		
		
	}

	public static void HorasMinutosSegundos()
	{
		Scanner input = new Scanner(System.in);
		String horaS, minutoS,horarioString;
		int horaInt,minutoInt,minutos,segundos;
		boolean VintequatroH;
		
		System.out.println("Digite a hora: ");
		horarioString = input.next();
		
		horaS = horarioString.substring(0, horarioString.indexOf(":"));
		minutoS= horarioString.substring(horarioString.indexOf(":")+1);
		
		horaInt = Integer.parseInt(horaS);
		minutoInt = Integer.parseInt(minutoS);
		

		if(horaInt<12)
		{	
			System.out.printf("Você quis dizer: %d:%d? S - Sim, N- Não: ",horaInt+12,minutoInt);
			String resp=input.next().toLowerCase();
			
			if(resp.equals("s")){horaInt+=12;}
		};
		
		
		minutos= (horaInt*60)+minutoInt;
		segundos = minutos*60;
		
		System.out.printf("%d:%d contém %d minutos e %d segundos",horaInt,minutoInt,minutos,segundos);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void Basic()
	{
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
		System.out.println("\n\nQual opção? \n0 - Sair\n1 - Horas viagem\n2 - Área Retângulo\n"
				+ "3 - Converter hora em minutos/segundos");
		option=input.nextInt();
		
		switch (option)
		{
		case 0:
			System.out.println("Voltando para menu principal");
			break;
		case 1:
			HorasViagem();
			break;
		case 2:
			AreaRetangulo();
			break;
		case 3:
			HorasMinutosSegundos();
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
