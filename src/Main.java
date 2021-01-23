import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int a = 0, b = 0, c = 0;
		String prodA = "Alcool", prodB = "Gasolina", prodC = "Diesel";
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Entre com o numero do produto desejado:\n1-Alccol\n2-Gasolina\n3-Diesel\n4-Fim\n");
		int x = sc.nextInt();
		
		while (x != 1 && x != 2 && x != 3 && x != 4) {
			System.out.printf("Numero invalido!\nEntre com o numero do produto desejado:\n1-Alccol\n2-Gasolina\n3-Diesel\n4-Fim\n");
			x = sc.nextInt();
		}
		
			while (x != 4) {
							
				switch (x) {
				case 1:
					//prodA = "Alcool";
					a += 1;
					break;
				case 2:
					//prodB = "Gasolina";
					b += 1;
					break;
				case 3:
					//prodC = "Diesel";
					c += 1;
					break;
				default:
					System.out.println("Numero invalido!");
				}
				System.out.printf("Se deseja encerrar, aperte 4. Caso contrario, selecione:\n1-Alccol\n2-Gasolina\n3-Diesel\n");
				x = sc.nextInt();
			}
		if (x == 4) {
			System.out.printf("Fim. Muito Obrigado!\n%s: %d\n%s: %d\n%s: %d\n",prodA,a,prodB,b,prodC,c);
		}
		sc.close();
	}

}
