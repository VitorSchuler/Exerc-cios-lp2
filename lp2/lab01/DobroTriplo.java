/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * Vitor Schuler Velloso Borges - 123110668
 */
import java.util.Scanner;

public class DobroTriplo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x * 2;
		int z = x * 3;
		System.out.println("dobro: " + y + ", triplo: " + z);
	}
}
