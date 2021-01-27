import java.util.Scanner;

/*
* Author : williampho
* Date : 26-Jan-2021
*///An artist wants to construct a sign whose letters will rotate freely in the breeze. In order to do this,
///she must only use letters that are not changed by rotation of 180 degrees: I, O, S, H, Z, X, and N.
///Write a program that reads a word and determines whether the word can be used on the sign.

public class RotatingLettres
	{

		public static void main(String[] args)
			{

				        Scanner in = new Scanner(System.in);
				        String a = in.next();
				        boolean flag = false;
				        
				        for(int i = 0; i < a.length(); i++){
				            
				        	if(a.charAt(i) == 'I'){ 
				            	
				            }else if(a.charAt(i) == 'S'){
				            	
				            	}else if(a.charAt(i) == 'H'){
				                
				            		}else if(a.charAt(i) == 'Z'){
				                
				            			}else if(a.charAt(i) == 'X'){
				                
				            				}else if(a.charAt(i) == 'N'){
				            					
				            					}else if(a.charAt(i) == 'O'){
				            						
				            						}else if(a.charAt(i) == '8') {
				            							
				            							}else if(a.charAt(i) == '='){
				            								
				            								}else if(a.charAt(i) == '+'){
				            									
				            									}else if(a.charAt(i) == '$'){
				            
				            }else{
				                flag = true;
				            }
				              
				            
				        }
				        if(flag){
				                System.out.println("Pas Possible Pour Etre Un Mot ou Charatere");
				            }else{
				                System.out.println("Possible Pour Etre Un Mot ou Charactere");
				            }
				        
				    }
				

			}

	
