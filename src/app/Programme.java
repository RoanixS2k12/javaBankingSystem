/*_________________________________________________________________*/
/**
 *	Fichier : Programme.java
 *	
 * 	Créé le 13 janv. 2014 à 10:20:39
 *
 *	Auteur : Couma Joani
 */
package app;

import banking.Banque;
import banking.Client;

/*_________________________________________________________________*/
/**
 */
public class Programme {

	public static void main(String [] args)
	{
		
		Client paul = new Client("Dupont", "Paul", 100);
		Client virginie = new Client("Dupont", "Virginie", -100);
		
		paul.lancer();
		virginie.lancer();

	}
	
	
	public static void KageBunshinNoJUSTU(int nombre, Client cl)
	{
		for(int i = 0; i < nombre; i++)
		{
			cl.lancer();
		}
	}
	
}

/*_________________________________________________________________*/
/*	Fin du fichier Programme.java
/*_________________________________________________________________*/