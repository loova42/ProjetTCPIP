package model;

import exception.AdresseInvalideException;

public class AdresseIP extends Adresse {
	
	private int masque;
	private char classe;

	public AdresseIP(int[] adresse,int masque) throws AdresseInvalideException {
		super(adresse);
		this.classe = this.determinerClasse(adresse);
	}
	
	
	public char determinerClasse(int[] adresse) {
		
		if(adresse[0] > 0 && adresse[0] < 128)
			return 'A';
		else if(adresse[0] >= 128 && adresse[0] < 192)
			return 'B';
		else if(adresse[0] >= 192 && adresse[0] < 224)
			return 'C';
		else if(adresse[0] >= 224 && adresse[0] < 240)
			return 'D';
		else
			return 'E';
	}

}
