import java.util.Scanner;

/*
* Author : williampho
* Date : 27-Nov-2020
*/
public class Activite5
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
				int min = 0;
				System.out.println(montab[min]);
				sc.close();
				
				System.out.println();
				
		        }  
		       

			}
