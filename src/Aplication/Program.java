package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entitties.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion champion1, champion2;
		
		System.out.println("Digite os dados do primeito campeão:");
		System.out.print("Nome:");
		String name = sc.nextLine();
		System.out.print("Vida Inicial:");
		int life = sc.nextInt();
		System.out.print("Ataque:");
		int attack = sc.nextInt();
		System.out.print("Armadura:");
		int armor = sc.nextInt();
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome:");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("Vida Inicial:");
		int life2 = sc.nextInt();
		System.out.print("Ataque:");
		int attack2 = sc.nextInt();
		System.out.print("Armadura:");
		int armor2 = sc.nextInt();		
		champion1 = new Champion(name, life, attack2, armor);
		champion2 = new Champion(name2, life2, attack, armor2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turno = sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=turno;i++) {
			System.out.printf("Resultado do turno %d:%n", i);
			champion1.takeDamage();
			champion2.takeDamage();
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
			if(champion1.getLife() <= 0 ||champion2.getLife() <= 0)
				break;
		}
		
		System.out.print("FIM DO COMBATE");
		
		
		sc.close();

	}

}
