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
		Banque.getInstance();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Client paul = new Client("Dupont", "Paul", 100);
		Client virginie = new Client("Dupont", "Virginie", -100);
		
		paul.lancer();
		virginie.lancer();
	}
	
}

/*_________________________________________________________________*/
/*	Fin du fichier Programme.java
/*_________________________________________________________________*/