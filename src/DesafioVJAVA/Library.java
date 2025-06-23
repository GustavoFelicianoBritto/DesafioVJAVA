package DesafioVJAVA;
import java.util.Scanner;

public class Library {

	
	//======================================
	
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
	
	public static void ContaDelivery()
	{
		/*
			Prato 1 = R$ 10,00
			Prato 2 = R$ 13,00
			Taxa fixa de entrega = R$ 7,00
		 */
		Scanner input = new Scanner(System.in);
		
		
		double prato1=10.00,prato2=13.00,entrega=7.00;
		int option,contIndex=0,qtd;
		double pedido[]= new double[5],total=0;
		
		
		do {
		System.out.print("Qual prato você deseja comprar?\n1 - Prato 1 = R$ 10,00\n2 - Prato 2 = R$ 13,00\n0 - Finalizar compras ");	
		option = input.nextInt();
		
		switch (option)
		{
		case 1:
			System.out.printf("Digite a quantidade do prato 1: ");
			qtd=input.nextInt();
			pedido[contIndex]=prato1*qtd;
			contIndex+=1;
			break;
		case 2:
			System.out.printf("Digite a quantidade do prato 2: ");
			qtd=input.nextInt();
			pedido[contIndex]=prato2*qtd;
			contIndex+=1;
			break;
		case 0:
			System.out.println("Finalizando compras");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

		}while(option!=0);
		
		for (int i=0;i<pedido.length;i++)
		{
			//System.out.print(pedido[i]>0?pedido[i]+" ":" ");
			total+=pedido[i];	
		}
		
		total += entrega;
		
		for (int j=0;j<pedido.length;j++)
		{
			System.out.println(pedido[j]>0?pedido[j]+" ":" ");
		}
		System.out.printf("\nEntrega: %.2f",entrega);
		System.out.println("\n------------");
		System.out.printf(total>7?"Total com entrega: "+total+"":"Carrinho vazio");
	
	}
	
	//======================================
	
	public static void JurosAtraso()
	{

		Scanner input = new Scanner (System.in);
		
		int dias, respJuros;
		double  parcela, juros;
		
		System.out.println("Qual valor inicial da parcela? ");
		parcela=input.nextDouble();
		double parcelainicial=parcela;
	
		System.out.println("Quantos dias está atrasada? ");
		dias=input.nextInt();
		
		System.out.println("Qual porcentagem de juros por dia? \n1- 5%\n2- 10% ");
		respJuros=input.nextInt();
		
		if(respJuros==1) {juros = 5.0;}
		else if(respJuros==2) {juros=10.0;}
		else 
		{
			System.out.println("Opção inválida, juros mais alto selecionado");
			juros=10.0;
		}
		
		for(int i=0;i<dias;i++)
		{
			parcela= parcela+((parcela*juros)/100);
		}
		
		System.out.printf("Valor inicial: %.2f\nDias em atraso: %d dias"
				+ "\nJuros por dia: %.1f %%\ntotal a pagar: %.2f",parcelainicial,dias,juros, parcela);
			

	}
	
	public static void DiaUtil()
	{
	
		Scanner input = new Scanner(System.in);
		String semana[]= {"1- Domingo","2- Segunda","3- Terça","4- Quarta","5- Quinta",
				"6- Sexta","7- Sábado"};
		
		System.out.println("Digite o número para verificar (1 - 7): ");
		for(int i=0;i<semana.length;i++) {System.out.println(semana[i]);}
		
		int num = input.nextInt();
		
		switch(num)
			{
				case 2,3,4,5,6:
					System.out.println(semana[num-1]+" feira Dia útil");
					break;
				case 1,7:
					System.out.println(semana[num-1]+" final de semana");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		
	}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	//======================================
	//======================================
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void Basic()
	{
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
		System.out.println("\n\nQual opção? \n0 - Sair\n1 - Horas viagem\n2 - Área Retângulo\n"
				+ "3 - Converter hora em minutos/segundos\n4 - Pedido delivery");
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
		case 4:
			ContaDelivery();
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
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			System.out.println("\n\nQual opção? \n0 - Sair\n1 - Juros diários\n2 - Dia útil");
			option=input.nextInt();
			
			switch (option)
			{
			case 0:
				System.out.println("Voltando para menu principal");
				break;
			case 1:
				JurosAtraso();
				break;
			case 2:		
				DiaUtil();
				break;
			case 3:			
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
		while(option!=0);
	
		
		
	}
	
	public static void Repetition()
	{
		
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			System.out.println("\n\nQual opção? \n0 - Sair");
			option=input.nextInt();
			
			switch (option)
			{
			case 0:
				System.out.println("Voltando para menu principal");
				break;
			case 1:			
				break;
			case 2:			
				break;
			case 3:			
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
		while(option!=0);
	
		
		
	}
	
	public static void Math()
	{
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			System.out.println("\n\nQual opção? \n0 - Sair");
			option=input.nextInt();
			
			switch (option)
			{
			case 0:
				System.out.println("Voltando para menu principal");
				break;
			case 1:			
				break;
			case 2:			
				break;
			case 3:			
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
		while(option!=0);
	
		
		
	}
	public static void Vector()
	{
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			System.out.println("\n\nQual opção? \n0 - Sair");
			option=input.nextInt();
			
			switch (option)
			{
			case 0:
				System.out.println("Voltando para menu principal");
				break;
			case 1:			
				break;
			case 2:			
				break;
			case 3:			
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
		while(option!=0);
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
