package lp2.lab01;
public class IdadePreferencialInteligente {
	public static void main(String[] args) { // Definindo uma função
	int ano_atual = 2024;
	int ano_nascimento = 2004;
	int idade = ano_atual - ano_nascimento;
	if (idade >= 60) {
		System.out.println("Voce tem " + idade + " anos. Voce pode usar o atendimento especial.");}
       	else {
System.out.println("Voce tem " + idade + " anos. Voce ainda nao pode usar o atendimento especial.");
}
}
}
