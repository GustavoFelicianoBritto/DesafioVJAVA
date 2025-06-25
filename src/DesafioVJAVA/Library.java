package DesafioVJAVA;
import java.util.Scanner;


import java.util.Random;

public class Library
{
	public static void clearConsoleWindows() {
	    try {
	        // Cria um ProcessBuilder para executar o comando 'cmd /c cls'
	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    } catch (final Exception e) {
	        // Lida com qualquer exceção que possa ocorrer (por exemplo, se o comando não for encontrado)
	        System.out.println("Erro ao limpar o console (Windows): " + e.getMessage());
	    }
	}
	
	
	
	//======================================basico
	
	public static void HorasViagem(Scanner inputMain)
	{
		clearConsoleWindows();
		//Scanner input = new Scanner(System.in);
		int dias, horas,total;
		
		System.out.print("Digite quantos dias você viajou: ");
		dias = inputMain.nextInt();
		System.out.print("Digite quantas horas extras você viajou: (0 = nenhuma hora extra) ");
		horas = inputMain.nextInt();
		total = (dias *24)+horas;
		
		System.out.printf(horas<=0?"Você viajou por "+ dias +" dias, ou seja, "+ total +" horas.":"Você viajou por "+ dias +" dias e "+ horas+" horas, ou seja, "+ total +" horas.\n");
		
	}
	
	public static void AreaRetangulo(Scanner inputMain)
	{
		clearConsoleWindows();
		//Receber base e altura de um retângulo e mostrar a área.
		//Scanner input = new Scanner(System.in);
		double base,altura,area;
		
		System.out.println("Digite a base do retângulo: ");
		base = inputMain.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		altura = inputMain.nextDouble();
		
		area = base*altura;
		
		System.out.printf("O retângulo de base %.1f metros e altura %.1f metros tem área de %.1f",base,altura,area);
		
		
	}

	public static void HorasMinutosSegundos(Scanner inputMain)
	{
		clearConsoleWindows();
		//Scanner input = new Scanner(System.in);
		String horaS, minutoS,horarioString;
		int horaInt,minutoInt,minutos,segundos;
		//boolean VintequatroH;
		
		System.out.println("Digite a hora: ");
		horarioString = inputMain.next();
		
		horaS = horarioString.substring(0, horarioString.indexOf(":"));
		minutoS= horarioString.substring(horarioString.indexOf(":")+1);
		
		horaInt = Integer.parseInt(horaS);
		minutoInt = Integer.parseInt(minutoS);
		

		if(horaInt<12)
		{	
			System.out.printf("Você quis dizer: %d:%d? S - Sim, N- Não: ",horaInt+12,minutoInt);
			String resp=inputMain.next().toLowerCase();
			
			if(resp.equals("s")){horaInt+=12;}
		};
		
		
		minutos= (horaInt*60)+minutoInt;
		segundos = minutos*60;
		
		System.out.printf("%d:%d contém %d minutos e %d segundos",horaInt,minutoInt,minutos,segundos);
		
	}
	
	public static void ContaDelivery(Scanner inputMain)
	{
		clearConsoleWindows();
		//Scanner input = new Scanner(System.in);

		double prato1=10.00,prato2=13.00,entrega=7.00;
		int option,contIndex=0,qtd;
		double pedido[]= new double[5],total=0;
		
		
		do {
		System.out.print("Qual prato você deseja comprar?\n1 - Prato 1 = R$ 10,00\n2 - Prato 2 = R$ 13,00\n0 - Finalizar compras ");	
		option = inputMain.nextInt();
		
		switch (option)
		{
		case 1:
			clearConsoleWindows();
			System.out.printf("Digite a quantidade do prato 1: ");
			qtd=inputMain.nextInt();
			pedido[contIndex]=prato1*qtd;
			contIndex+=1;
			break;
		case 2:
			clearConsoleWindows();
			System.out.printf("Digite a quantidade do prato 2: ");
			qtd=inputMain.nextInt();
			pedido[contIndex]=prato2*qtd;
			contIndex+=1;
			break;
		case 0:
			clearConsoleWindows();
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
	
	//======================================decisão
	
	public static void JurosAtraso(Scanner inputMain)
	{
		clearConsoleWindows();

		//Scanner input = new Scanner (System.in);
		
		int dias, respJuros;
		double  parcela, juros;
		
		System.out.println("Qual valor inicial da parcela? ");
		parcela=inputMain.nextDouble();
		double parcelainicial=parcela;
	
		System.out.println("Quantos dias está atrasada? ");
		dias=inputMain.nextInt();
		
		System.out.println("Qual porcentagem de juros por dia? \n1- 5%\n2- 10% ");
		respJuros=inputMain.nextInt();
		
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
	
	public static void DiaUtil(Scanner inputMain)
	{
		clearConsoleWindows();
	
		//Scanner input = new Scanner(System.in);
		String semana[]= {"1- Domingo","2- Segunda","3- Terça","4- Quarta","5- Quinta",
				"6- Sexta","7- Sábado"};
		
		System.out.println("Digite o número para verificar (1 - 7): ");
		for(int i=0;i<semana.length;i++) {System.out.println(semana[i]);}
		
		int num = inputMain.nextInt();
		
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
		
	public static void eleicao(Scanner inputMain)
	{
		clearConsoleWindows();
		//Scanner input = new Scanner(System.in);
	
		String candidatos[]=new String[3];
		int votos[]=new int [3];
		
		
		for (int i=0;i<candidatos.length;i++)
		{
			System.out.printf("Digite o nome do %d candidato: ",i+1);
			candidatos[i]=inputMain.next();
			
			System.out.printf("Digite a quantidade total de votos em %s: ",candidatos[i]);
			votos[i]=inputMain.nextInt();
			System.out.println();

		}
		
		if(votos[0]>(votos[1]+votos[2]))
		{
			System.out.println(candidatos[0]+" é o vencedor com "+votos[0]+" votos");
		}
		else if(votos[1]>(votos[2]+votos[0]))
		{
			System.out.println(candidatos[1]+" é o vencedor com "+votos[1]+" votos");
		}
		else if(votos[2]>(votos[1]+votos[0]))
		{
			System.out.println(candidatos[2]+" é o vencedor com "+votos[2]+" votos");
		}
		else
		{
			System.out.println("Dados inconclusivos: ");
			for(int j=0;j<candidatos.length;j++)
			{
				System.out.println(candidatos[j]+": "+votos[j]+" votos");
			}
		}
	
	
	
	}
	
	public static void viagem()
	{
		clearConsoleWindows();
		//Estado da estrada (liberada/bloqueada) baseado na temperatura.
		
		int selectorTemp, randomday;
		String StatusEstrada[]= {"liberada","bloqueada"};
		Random selector = new Random();
		
		randomday= selector.nextInt(1,31);
		
		System.out.printf("Dia de viagem %d\n",randomday);
		System.out.println("...\n...\n...");
		
		selectorTemp= selector.nextInt(-20,20);

		System.out.printf("Temperatura atual: %dº graus",selectorTemp);
		System.out.println();
		System.out.println(selectorTemp>7?"Viagem "+StatusEstrada[0]+"!!!":"Viagem "+StatusEstrada[1]+"!!!");

		//System.out.println("\nAperte enter para ir para o próximo dia...");
		
		//input.next();

		
	}
	
	//======================================repetição

	//======================================
	
	
	
	public static void NumerosPares(Scanner inputMain)
	{
		clearConsoleWindows();
		//Scanner input = new Scanner(System.in);
		
		int contPar=0,contImpar=0;
		int numbers[]= new int[6];
		
		for(int i=0;i<6;i++)
		{
			System.out.printf("Digite o %dº número: ",i+1);
			numbers[i]= inputMain.nextInt();
			
			if(numbers[i]%2==0){contPar++;}
			else {contImpar++;}
		}
		
		for(int j=0;j<numbers.length;j++) {System.out.println(numbers[j]%2==0?numbers[j]+" par":numbers[j]+" impar");}
		System.out.println(contPar>contImpar?"Mais números pares foram inseridos":contImpar>contPar?"Mais números impares foram inseridos":"Mesma quantidade de números pares e impares inseridos");
		
		
	}
	

	
	
	
	
	
	
	
	
	//=================SUB MENU =====================
	public static void Basic(Scanner inputMain)
	{
		
		//Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
		
		System.out.println("\nQual opção? \n0 - Menu\n1 - Horas viagem\n2 - Área Retângulo\n"
				+ "3 - Converter hora em minutos/segundos\n4 - Pedido delivery");
		option=inputMain.nextInt();
		
		switch (option)
		{
		case 0:
			System.out.println("Voltando para menu principal");
			break;
		case 1:
			HorasViagem(inputMain);
			break;
		case 2:
			AreaRetangulo(inputMain);
			break;
		case 3:
			HorasMinutosSegundos(inputMain);
			break;
		case 4:
			ContaDelivery(inputMain);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
			
		}
		while(option!=0);
	}
	
	public static void Decision(Scanner inputMain)
	{
		
		//Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			
			System.out.println("\nQual opção? \n0 - Menu\n1 - Juros diários\n2 - Dia útil"
					+ "\n3 - Eleição simples\n4 - Viagem (Temperatura)");
			option=inputMain.nextInt();
			
			switch (option)
			{
			case 0:
				System.out.println("Voltando para menu principal");
				break;
			case 1:
				JurosAtraso(inputMain);
				break;
			case 2:		
				DiaUtil(inputMain);
				break;
			case 3:	
				eleicao(inputMain);
				break;
			case 4:
				viagem();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
		while(option!=0);
	
		
		
	}
	
	public static void Repetition(Scanner inputMain)
	{
		
		//Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			
			System.out.println("\nQual opção? \n0 - Menu\n1 - Numeros pares");
			option=inputMain.nextInt();
			
			switch (option)
			{
			case 0:
				System.out.println("Voltando para menu principal");
				break;
			case 1:	
				NumerosPares(inputMain);
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
	
	public static void Math(Scanner inputMain)
	{
		//Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			
			System.out.println("\nQual opção? \n0 - Menu");
			option=inputMain.nextInt();
			
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
	public static void Vector(Scanner inputMain)
	{
		//Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
			
			System.out.println("\nQual opção? \n0 - Sair");
			option=inputMain.nextInt();
			
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


	//***************MAIN MENU*********************
	
		
	public static void MainMenu(Scanner inputMain)
		{
			
			int option;
			
			do
			{	clearConsoleWindows();
				System.out.println("Bem vindo ao menu principal");
				System.out.println("0- Sair\n1- Básico\n2- Decisão"
						+ "\n3- Repetição\n4- Matemática\n5- Vetores");
				option=inputMain.nextInt();
				
				switch (option)
				{
				case 0:
					System.out.println("Saindo...");
					break;
				case 1:	
					clearConsoleWindows();
					Basic(inputMain);
					break;
				case 2:
					clearConsoleWindows();
					Decision(inputMain);
					break;
				case 3:	
					clearConsoleWindows();
					Repetition(inputMain);
					break;
				case 4:
					clearConsoleWindows();
					Math(inputMain);
					break;
				case 5:
					clearConsoleWindows();
					Vector(inputMain);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				
			}
			while(option!=0);
		
		}
	
}
	
	
	
	
	
	
	
	
	
	
	

