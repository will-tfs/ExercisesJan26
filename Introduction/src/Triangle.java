import java.util.Scanner;

/*
* Author : williampho
* Date : 30-Sep-2020
*/
public class Triangle
	{

		public static void main(String[] args)
			{
				int angle1, angle2, angle3;
				Scanner sc=new Scanner(System.in);
						angle1=sc.nextInt();
						angle2=sc.nextInt();
						angle3=sc.nextInt();
						int somme=angle1+angle2+angle3;
						if(somme==180);
							System.out.println("C'est un Triangle");
							
						else
							if(somme!=180)
							System.out.println("Pas Triangle");
						

			}

	}
