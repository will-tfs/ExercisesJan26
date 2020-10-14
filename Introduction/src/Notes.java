
import java.util.Scanner;

/*
* Author : williampho
* Date : 30-Sep-2020
*/// mon code a utiliser pour savoir mes notes d'IB
public class Notes
	{

		public static void main(String[] args)
			{
				int maNote;
				Scanner sc=new Scanner(System.in);
				System.out.println("Quelle est ta note?");
				maNote=sc.nextInt();
				
				if(maNote>=7)
					System.out.println("Exellente 97-100%");
				else
					if(maNote>=6)
						System.out.println("Tres Bien 93-96%");
					else
						if(maNote>=5)
							System.out.println("Bien 85-92%");
						else
							if(maNote>=4)
								System.out.println("Satisfaisant 74-84%");
							else
								if(maNote>=3)
									System.out.println("Mediocre 63-73%");
								else
									if(maNote>=2)
										System.out.println("Poor 53-62%");
									else
										if(maNote>=1)
											System.out.println("FAIL! <50%");

			}

	}
