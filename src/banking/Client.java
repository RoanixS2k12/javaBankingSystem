package banking;
/*_________________________________________________________________*/
/**
 *	Fichier : Client.java
 *	
 * 	Créé le 13 janv. 2014 à 09:18:46
 *
 *	Auteur : Couma Joani
 */

/*_________________________________________________________________*/
/**
 */
public class Client implements Runnable {

	private String nomTitulaire;
	private String prenomTitulaire;
	private int montantARetirer;
	private boolean actifeu;
	private Thread threadCourant;
	private int nbTransacMax = 10;
	
	/*_________________________________________________________________*/
	/**
	 * @param nom
	 * @param prenom
	 * @param montant
	 */
	public Client(String nom, String prenom, int montant ) {
		this.setNomTitulaire(nom);
		this.setPrenomTitulaire(prenom);
		this.montantARetirer = montant;
	}
	
	/*_________________________________________________________________*/
	/**
	 */
	public void lancer()
	{
		actifeu = true;
		threadCourant = new Thread(this);
		threadCourant.start();
	}
	
	/*_________________________________________________________________*/
	/**
	 */
	public void arreter()
	{
		actifeu = false;
	}
	

	/*_________________________________________________________________*/
	/** 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		Distributeur distrib = new Distributeur();
		
		int index = 0;
		
		while(index < nbTransacMax)
		{
			if(actifeu)
			{
				if(montantARetirer <= 0)
				{
					System.out.println(prenomTitulaire + " retire" );
					distrib.retirer(montantARetirer, this);
				}
				else
				{
					System.out.println(prenomTitulaire + " depose");
					distrib.deposer(montantARetirer, this);
				}
				
				index++;
			}
			
			
		}
	}

	/*_________________________________________________________________*/
	/** Permet d'obtenir la valeur du champ nomTitulaire.
	 * @return La valeur du champ nomTitulaire.
	 */
	public String getNomTitulaire() {
		return nomTitulaire;
	}

	/*_________________________________________________________________*/
	/** Modifie la valeur du champs nomTitulaire.
	 * @param nomTitulaire La valeur du champ nomTitulaire.
	 */
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	/*_________________________________________________________________*/
	/** Permet d'obtenir la valeur du champ prenomTitulaire.
	 * @return La valeur du champ prenomTitulaire.
	 */
	public String getPrenomTitulaire() {
		return prenomTitulaire;
	}

	/*_________________________________________________________________*/
	/** Modifie la valeur du champs prenomTitulaire.
	 * @param prenomTitulaire La valeur du champ prenomTitulaire.
	 */
	public void setPrenomTitulaire(String prenomTitulaire) {
		this.prenomTitulaire = prenomTitulaire;
	}
}

/*_________________________________________________________________*/
/*	Fin du fichier Client.java
/*_________________________________________________________________*/