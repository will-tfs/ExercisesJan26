package edu.tfs.com;

import java.lang.reflect.Array;

/*
* Author : williampho
* Date : 10-Dec-2020
*/// Ce programme touve la somme des entiers qui sont mis dans les parenthese
public class EvaluationFormative
	{

		public static void main(String[] args)
			{
				///Commande "array" utiliser
				
				int[] array = {1, 2 , 3, 4, 5};
				
				int somme = 0;
				
				for( int numero : array ) 
					
					///Ont trouve notre somme d'entiers pour crée "somme" par ajutant la somme de 0 initial + Numeros qui sont nos entiers///
					
					somme = somme+numero;
				
				///Notre Output finale de la some	
				
				System.out.println("Le Somme des entiers egale: ");
					System.out.println(somme);
			}

	}