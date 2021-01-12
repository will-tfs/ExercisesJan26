/*
* Author : williampho
* Date : 27-Nov-2020
*/
public class NombrePrime 
	{

		public static boolean main(String[] args)
			{
				int nbr=30;
				
				if(isPrimeNumber(nbr))
					System.out.println("Premier");
				else 
					System.out.println("Pas Nombre Premier");
				
				boolean isPrimeNumber (int n)
				
				for(int i=2;1<=n/2;i++)
					
					if(n%i ==0)
						
						return false;
				
				return true;
					
					
					
				

			}

		private static boolean isPrimeNumber(int nbr)
			{
				// TODO Auto-generated method stub
				return false;
			}

	}
