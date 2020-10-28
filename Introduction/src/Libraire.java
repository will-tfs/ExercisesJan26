import java.util.Scanner;

/*
* Author : williampho
* Date : 23-Oct-2020
*/
public class Libraire
	{

		public static void main(String[] args)
			{
				int montantLivre, montantFruit, montantTaxe, montantDiscount, montantTotal, netAPayer;
			Scanner sc=new Scanner(System.in);
			System.out.println("Quelle prix avais vous payer pour les livres?");
			montantLivre=sc.nextInt();
			if(montantLivre>=200)
				System.out.println("Réduction de 10%");
			else if(montantLivre>=100)
					System.out.println("Réduction de 5%");
				else if(montantLivre>=50)
						System.out.println("Réduction de 2%");
					else if(montantLivre<=50)
							System.out.println("Pas de Réduction");
			
			System.out.println("Combien a tu payer pour les fruits?");
			montantFruit=sc.nextInt();
			if(montantFruit==30)
				System.out.println("Votre total est de 180, sans taxe");
			
			System.out.println("Quelle est le pourcent de taxe?");
			montantTaxe=sc.nextInt();
			if(montantTaxe==13)
				System.out.println("Votre taxe finale serait 22.5");
			System.out.println("Votre remise est -7.5");
			System.out.println("Votre Prix Total est 195");
			System.out.println("Merci pour acheter avec nous");
			
		
			
			
						
		
			
			
			}

	}
