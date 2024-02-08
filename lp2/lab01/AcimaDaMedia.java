/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Vitor Schuler Velloso Borges - 123110668
 */
import java.util.Scanner;
public class AcimaDaMedia{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String[] listastr = sc.nextLine().split("\\s+");
	int[] listaint = new int[listastr.length];
	
	String out = "";

	double soma = 0;
	for(int i=0; i < listastr.length;i++){
		listaint[i] = Integer.parseInt(listastr[i]);
		soma += listaint[i];
	
	}
	double media = soma / listaint.length;
	for(int j=0; j < listaint.length;j++){
		if(listaint[j] > media){
			out += listaint[j];
			out += " ";
		}

	}
	System.out.println(out.strip());
	}
}
