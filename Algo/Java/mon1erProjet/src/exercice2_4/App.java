package exercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Variables
				annee est un entier
		   Début du programme
				Ecrire "saisir une année"
				Lire annee 
				Si annee mod 4 = 0 ET annee mod 100 != 0 OU annee mod 400 = 0
				alors 
					afficher annee
					Ecrire "Cette année est bissextile"
				sinon
					afficher annee
					Ecrire "Cette année est non bissextile"
Fin du programme
		 */
		
		int annee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir l'année");
		annee = sc.nextInt();
		
		if(annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
			System.out.println(annee +" cette année est bisssextile");
		}
		else {
			System.out.println(annee +" cette année est non bisssextile");
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
