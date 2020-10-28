import java.util.Scanner;

/*
* Author : williampho
* Date : 27-Oct-2020
* Évaluation d'apprentisage Informatique
* Probleme d'impots
*/
public class ImpotsWilliamEVAL
	

		public static void main(String[] args)
			{

					Scanner sc=new Scanner(System.in);
					String nom,prenom,facture;
					double montantSalaire,montantCharité,revenuImposable,impôtAPayer=0.0;

					System.out.println("Donner le nom ");
					nom=sc.nextLine();
					System.out.println("Donner le prénom ");
					prenom=sc.nextLine();
					System.out.println("Donner le salaire annuel brut ");
					montantSalaire=sc.nextDouble();
					System.out.println("Donner le montant de contribution pour les dons de bienfaisance ");
					montantCharité=sc.nextDouble();
				
				
				
				
				
				
				int VarMontantSalaire, VarMontantCharité, VarNom, VarAnnée, VarMontantRevenueBrut, VarMontantImpots;
				Scanner sc=new Scanner(System.in);
				VarNom=sc.nextInt();
				System.out.println("Bonjour");
				
				System.out.println("Quelle est votre salaire cette année sans impots");
				VarMontantSalaire=sc.nextInt();
				if(VarMontantSalaire>=200001)
					System.out.println("Réduction de 20%, 40% est invalide");
				else if(VarMontantSalaire>=100000)
						System.out.println("Réduction de 20%, 30% est invalide");
				       else if(VarMontantSalaire>=50000)
							System.out.println("Réduction de 20%");
						else if(VarMontantSalaire>=30000)
								System.out.println("Réduction de 15%");
						else if(VarMontantSalaire>=20000)
							System.out.println("Réduction de 10%");
						else if(VarMontantSalaire<=20000)
							System.out.println("Réduction de 0.5%");
				

			

	
