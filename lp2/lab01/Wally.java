/**
 *Laboratório de Programação 2 - Lab 1
 *
 * Vitor Schuler Velloso Borges - 123110668
 */

import java.util.Scanner;

public class Wally{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String[] nomes = sc.nextLine().split(" ");
			String resp = "";
			for(String i : nomes){
				if(i.equals("wally")){
					break;
				}

				else if(i.length() == 5){
					resp = i; 
				}


			}
			
		System.out.println(resp);
		}

	}
}
