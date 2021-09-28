package model;

import exception.AdresseInvalideException;

public abstract class Adresse {
	
	private int adresse[];
	
	public Adresse(int[] adresse) throws AdresseInvalideException {
		if(this.verifier(adresse))
			this.adresse = adresse;
		else
			throw new AdresseInvalideException();
	}
	
	/**
	 * Vérifie si l'adresse est valide.
	 * 
	 * @param adresse
	 * 			l'adresse sous forme de tableau.
	 * 
	 * @return true si l'adresse est valide, false si elle ne l'est pas.
	 */
	public boolean verifier(int[] adresse) {
		
		for(int octet : adresse) {
			if(octet != (int)octet || octet < 0 || octet > 255)
				return false;
		}
		
		return true;
	}

}
