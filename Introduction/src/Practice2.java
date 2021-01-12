import java.util.Arrays;

/*
* Author : williampho
* Date : 2-Dec-2020
*/
public class Practice2
	{

		public static void main(String[] args)
			{
				int []maliste= {3,4,5,7,9,8,100,5,3,10};
				for (int i =maliste.length-1;i>0;i--) 
				
				{
					int j=(int)(Math.random()*(i+1));
					
					int temp=maliste[i];
					maliste[i]=maliste[j];
					maliste[j]=temp;
					
					
				}
				for (int i : maliste) 
				
				{
					System.out.println(i);
				}

			}

			}


