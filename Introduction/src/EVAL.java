import java.util.Scanner;

/*
* Author : williampho
* Date : 27-Oct-2020
*/
public class EVAL
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				String VarNom,VarPrenom;
				double payer = 0, VarmontantSalaire,VarmontantCharité,VarRevenueImpossable = 0,VarRevenueAvantImpots,VarImpot=0.0;
				String facture;

				System.out.println("Donner le nom ");
				VarNom=sc.nextLine();
				System.out.println("Donner le prénom ");
				VarPrenom=sc.nextLine();
				
				System.out.println("Quelle est votre salaire cette année sans impots");
				VarmontantSalaire=sc.nextInt();
				if(VarmontantSalaire>=200000)
					System.out.println("Réduction de 20%, 40% est invalide");
				else if(VarmontantSalaire>=100000)
						System.out.println("Réduction de 20%, 30% est invalide");
				       else if(VarmontantSalaire>=50000)
							System.out.println("Réduction de 20%");
						else if(VarmontantSalaire>=30000)
								System.out.println("Réduction de 15%");
						else if(VarmontantSalaire>=20000)
							System.out.println("Réduction de 10%");
						else if(VarmontantSalaire<=20000)
							System.out.println("Réduction de 0.5%");
				
			/// Revenu Brut + Impôts + Contributions en Charité = salaire d’une année (brute)
			///	Salaire d’une Année - Impôts - Contributions en Charité = Revenue Brut
				
				System.out.println("Confirmer ton salaire");
				VarmontantCharité=sc.nextDouble();

				if(VarmontantSalaire>=200000)
				{
					VarmontantCharité=VarmontantSalaire*0.2;
				}
				else if(VarmontantSalaire>=100000)
				{
					VarmontantCharité=VarmontantSalaire*0.2;
				}
				else if(VarmontantSalaire>=50000)
				{
					VarmontantCharité=VarmontantSalaire*0.2;
				}
				else if(VarmontantSalaire>=30000)
				{
					VarmontantCharité=VarmontantSalaire*0.15;
				}
				else if(VarmontantSalaire>=20000)
				{
					VarmontantCharité=VarmontantSalaire*0.1;
				}
				else if(VarmontantSalaire<=20000)
				{
					VarmontantCharité=VarmontantSalaire*0.05;
				}
				 
				
				System.out.println(VarmontantSalaire-VarmontantCharité);

				VarImpot=33;
				
				/// montant devrait etre egale a Salaire initial moins les dons au charité(20%)
				System.out.println("Merci d’avoir produit votre déclaration de revenus. D’après les informations fournies, nous avons calculé");
				facture="Facture pour : "+VarPrenom + " " + VarNom + "\n \n";
				facture=facture + "Voici les détails de vos achats"+ "\n";
				facture=facture + VarmontantSalaire+ " $" + "\n";
				if(VarmontantCharité>0)
				facture=facture + "Charité: \t"+ VarmontantCharité+" $" + "\n";
				facture=facture + "impots : \t"+ String.format("%.2f", VarImpot) +"%" + "\n";
				facture=facture + "Total : \t"+ VarmontantSalaire + "\n";
				
				System.out.println(VarmontantSalaire-VarImpot);

				facture=facture + "Remise: \t"+ + VarmontantCharité + "\n";
				System.out.println(facture);

				
				
				
				
			}

	}
