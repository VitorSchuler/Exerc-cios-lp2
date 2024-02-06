/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Vitor Schuler Velloso Borges - 123110668
 */

import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String operador = sc.nextLine();
	float resultado = 0;
	if(operador.equals("+") |operador.equals("-") |operador.equals("*") |operador.equals("/")){
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		if(n2 != 0){
			if(operador.equals("+")){
				resultado = n1 + n2;
				
			}else if(operador.equals("-")){
				resultado = n1 - n2;
			
			}else if(operador.equals("*")){
                        	resultado = n1 * n2;
                	
			}else if(operador.equals("/")){
                        	resultado = n1 / n2;
                	
			}System.out.println("RESULTADO: " + resultado);
			
		}else{
			System.out.println("ERRO");
		}
	}
	else{
		System.out.println("ENTRADA INVALIDA");
	}

	}
}
