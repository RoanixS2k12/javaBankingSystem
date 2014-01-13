/*_________________________________________________________________*/
/**
 *	Fichier : Distributeur.java
 *	
 * 	Créé le 13 janv. 2014 à 09:19:23
 *
 *	Auteur : Couma Joani
 */
package banking;

/*_________________________________________________________________*/
/**
 */

public class Distributeur {

	private int deltaTemps = 100;
	private Banque banque = Banque.getInstance();
	
	/*_________________________________________________________________*/
	/**
	 */
	public Distributeur()
	{
		
	}
	/*_________________________________________________________________*/
	/**
	 * @param montant
	 * @param client
	 * @return
	 */
	public int retirer(int montant, Client client) {
		try {
			Thread.sleep(deltaTemps);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String prenom = client.getPrenomTitulaire();
		String nom = client.getNomTitulaire();
		
		int solde = banque.getSoldes(nom);
		
		System.out.println(prenom + " retirer " + montant + " de son solde (" + solde + ")");
	
		Integer soldes;
		synchronized (Banque.getInstance()) {
			 soldes = banque.getSoldes(client.getNomTitulaire());
			
			soldes += montant;
			
			banque.setSoldes(client.getNomTitulaire(), soldes);
		}

		return soldes;
		
	}

	/*_________________________________________________________________*/
	/**
	 * @param montant
	 * @param client
	 */
	public void deposer(int montant, Client client) {
		try {
			Thread.sleep(deltaTemps);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String prenom = client.getPrenomTitulaire();
		String nom = client.getNomTitulaire();
		
		int solde = banque.getSoldes(nom);
		
		Integer soldes;
		
		synchronized (Banque.getInstance()) {
			soldes = banque.getSoldes(client.getNomTitulaire());
			
			soldes += montant;
			
			banque.setSoldes(client.getNomTitulaire(), soldes);
		}
		
		System.out.println(prenom + " depose " + montant + " de son solde (" + solde + ")");
		

	}
	
}

/*_________________________________________________________________*/
/*	Fin du fichier Distributeur.java
/*_________________________________________________________________*/