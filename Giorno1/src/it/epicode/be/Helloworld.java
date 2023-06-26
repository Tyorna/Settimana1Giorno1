package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		//Esercizio 2
		int risultatoMolt = molt(5, 3);
		System.out.println(risultatoMolt);
		
		String parola = "Ciao";
		int num1 = 2;
		System.out.println(parola + " " + num1);
		
		String arrayStringhe[]  = { "1", "2", "3", "4", "5"};
		String unaStringa = "6";
		for(int i=0; i<6; i++) {
				if(i == 2) {
					System.out.println(unaStringa);
				} else if ( i > 2) {
					System.out.println(arrayStringhe[i - 1]);
				} else {
				System.out.println(arrayStringhe[i]);
				}
		}

		//Esercizio 3 
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String prima = input.nextLine();
		System.out.println("Inserisci un altra parola");
		String seconda = input.nextLine();
		System.out.println("Inserisci una terza parola");
		String terza = input.nextLine();
		
		System.out.println("Le parole inserite sono: " + prima + " " + seconda + " " + terza);
		System.out.println("Le parole inserite sono: " + terza + " " + seconda + " " + prima);
		
		
		//Esercizio 4


		double perimetroRettangolo = perimetro(7.5, 5.5);
		System.out.println(perimetroRettangolo);
		
		System.out.println("Calcola il perimetro di un rettangolo, inserisci l'altezza");
		double altezza =  Double.parseDouble(input.nextLine());
		System.out.println("Inserisci la base");
		double base = Double.parseDouble(input.nextLine());
		System.out.println(altezza * base);
	
		
		System.out.println("Inserisci un numero");
		int pariDispari = Integer.valueOf(input.nextInt());
		int risultato = zero(pariDispari);
		System.out.println(risultato);
		
		
		System.out.println("Inserisci lato triangolo");
		int lato1 = input.nextInt();
		System.out.println("Inserisci 2° lato triangolo");
		int lato2 = input.nextInt();
		System.out.println("Inserisci 3* lato triangolo");
		int lato3 = input.nextInt();
	    int totale = area(lato1, lato2, lato3);
		System.out.println("Il totale è: " + totale);
		input.close();
		}

public static int molt(int n1, int n2) {
			return n1 * n2;
			}

public static int zero(int pari) {
	if (pari % 2 ==  0) {
		return 0;
	}else {
		return 1;
	}}
	
public static double perimetro(double h, double b) {
	return (h + b) * 2;
	}

public static int area(int l1, int l2, int l3) {
	return l1 * l2 * l3;
	}

}



