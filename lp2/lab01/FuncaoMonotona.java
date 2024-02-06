/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * Vitor Schuler Velloso Borges - 123110668
 */

import java.util.Scanner;
public class FuncaoMonotona {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		int v4 = sc.nextInt();

		if(v1<v2 && v2<v3 && v3<v4){
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		}
		else if(v1>v2 && v2>v3 && v3>v4){
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		}
		else{
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}	
	}
}
