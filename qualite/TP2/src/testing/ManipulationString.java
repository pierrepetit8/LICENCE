package testing;

import java.security.InvalidParameterException;

public class ManipulationString {
	public int sum(String s) throws NullPointerException{
		if(s == null) {
			throw new NullPointerException();
		}
		int taille = s.length();
		int somme = 0;
		for(int i=0; i<taille; i++) {
			somme += (int)s.charAt(i);
		}
		return somme;
	}

	
	
}
