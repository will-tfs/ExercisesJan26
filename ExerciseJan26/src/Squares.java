import java.util.Scanner;

/*
* Author : williampho
* Date : 26-Jan-2021
*///Gigi likes to play with squares. She has a collection of equal-sized square tiles. Gigi
///wants to arrange some or all of her tiles on a table to form a solid square. What is the side
///length of the largest possible square that Gigi can build?
///For example, when Gigi has 9 tiles she can use them all to build a square whose side
///length is 3. But when she has only 8 tiles, the largest square that she can build has side
///length 2.
///Write a program that asks the userfor the number of tiles and then prints out the
///maximum side length. You may assume that the user will only type integers that are less
///than ten thousand. Once your program has read the user’s input and printed the largest
///square, your program stops executing.
///There are many different methods that your program might use to find the answer. You
///may use any method. For example, here is one method. First, check whether there are
///enough tiles to build a square of side length 1. If there are enough tiles, then move on to
///check the side lengths 2, 3, 4, etc., until your program finds a length that is too large.

public class Squares
	{

		public static void main(String[] args)
			{
				Scanner in =new Scanner(System.in);
				///Ci dessou on utilise la commande sqrt (square root) ceci serve pour trouver si la valeur des cotés est fiable.
				int a = (int)Math.sqrt(in.nextInt());
				System.out.println("Plus Grand Coté Possible Avec Ton Nombre de Tiles" + a );

			}

	}
