package banking;

import java.util.HashMap;
import java.util.Map;
/*_________________________________________________________________*/
/**
 *	Fichier : Banque.java
 *	
 * 	Créé le 13 janv. 2014 à 09:18:39
 *
 *	Auteur : Couma Joani
 */

/*_________________________________________________________________*/
/**
 */
public class Banque {

	private Map<String, Integer> soldes;
	
	private static Banque singleton;
	
	/*_________________________________________________________________*/
	/**
	 * @return
	 */
	public static Banque getInstance()
	{
		if(singleton == null)
			singleton = new Banque();
		return singleton;
	}
	
	/*_________________________________________________________________*/
	/**
	 */
	private Banque()
	{
		soldes = new HashMap<String, Integer>();
		soldes.put("Dupont",1000);
	}
	
	/*_________________________________________________________________*/
	/**
	 * @param nomDuTitulaire
	 * @return
	 */
	public Integer getSoldes(String nomDuTitulaire)
	{
		return soldes.get(nomDuTitulaire);
	}
	
	/*_________________________________________________________________*/
	/**
	 * @param nomDuTitulaire
	 * @param solde
	 */
	public void setSoldes(String nomDuTitulaire, int solde)
	{	
		soldes.put(nomDuTitulaire, solde);
	}
	
}

/*_________________________________________________________________*/
/*	Fin du fichier Banque.java
/*_________________________________________________________________*/