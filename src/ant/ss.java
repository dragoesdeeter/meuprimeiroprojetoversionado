package ant;

import java.util.Scanner;

	public class ss{
		private static Scanner ler;

		public static void main(String args[]) {
			int	usuario,setor,quant,preco=0, totalCompra = 0;
			char repetir = 'n';
			do{
				do{
					System.out.println("Tipo de ingresso: "+ "(Digite 1 para estudante, 2 para idoso ou 3 para inteiro): ");
					ler = new Scanner(System.in);
					usuario = ler.nextInt();

					switch (usuario) {
					case 1:
						System.out.println("estudante.");
						break;
					case 2:
						System.out.println("idoso.");
						break;
					case 3:
						System.out.println("inteiro.");
						break;
					default:
						System.out.println("erro!");
					}
				}while((usuario>3) || (usuario<1));

				do{

					System.out.println("setor desejado, digite: 1 frontal, 2 intermediário e 3 superior: ");

					setor = ler.nextInt();

					switch (setor) {

					case 1:
						System.out.println("frontal!");
						preco=120;
						break;
					case 2:
						System.out.println("intermediario!");
						preco = 80;
						break;
					case 3:
						System.out.println("superior!");
					preco = 180;
					break;

					default:
						System.out.println("setor invalido!");
					}
				}while((setor >3)||(setor<1));

				if (usuario==3) {
					System.out.println ("ingresso escolhido é " +preco);
				}
				else {
					preco = preco/2;
					System.out.println ("ingresso escolhido é  " +preco);
				}

				do{
					System.out.println("informe a quantidade: mínimo 1 e máximo 3: ");

					quant = ler.nextInt();

					switch (quant) {

					case 1:
						System.out.println("total: 1 ingresso.");
						break;
					case 2:	
						System.out.println("total: 2 ingressos.");
						break;
					case 3:
						System.out.println("total: 3 ingressos.");
						break;

					default:
						System.out.println("total invalido!");
					}

				}while ((quant>3)||(quant<1));

				totalCompra = totalCompra + (preco*quant);

				System.out.println("Você comprou " +quant +" ingresso(s) no setor " +setor +".")
				;System.out.println("total da compra é" +(preco*quant) +".");
				System.out.println("deseja continuar? s-sim ou n-nao ");

				repetir = ler.next().charAt(0);

			}while(repetir=='s');

			System.out.println("total da compra: " + totalCompra +".");
			

		}

	}


}
