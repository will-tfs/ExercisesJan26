import java.util.Scanner;

/*
* Author : williampho
* Date : 2-Nov-2020
*/
public class TableauINT
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner (System.in);
				// Tableau de nombres entiers
				int [] montab = new int [5];
				
				for(int i=0; i<5; i++)
				{
					System.out.println("Donne Nombre ");
					montab[i]=sc.nextInt();
				}
				System.out.println(montab[3]);
				sc.close();
			
				

			}

	}
