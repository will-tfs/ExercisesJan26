import java.util.Scanner;

/*
* Author : williampho
* Date : 21-Sep-2020
*/
public class Userinput
	{

		public static void main(String[] args)
			{
				String monNom="";
				Scanner sc=new Scanner(System.in);
				int a=0; int b=0;
			    System.out.println("Quel est ton nom");
				monNom=sc.nextLine();
				System.out.println("anné de naissance :");
				a=sc.nextInt();
				System.out.println("Nombre representant mois de naissance : ");
				b=sc.nextInt();
						
				
				System.out.println("Bonjour "+monNom);
				System.out.println("tu es né en "+ a + " au mois " + b);
				
				
				
				
				sc.close();

			}

	}
