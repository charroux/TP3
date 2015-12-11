package maths;

import javax.management.BadAttributeValueExpException;

public class Statistique {
	
	/**
	 * 
	 * @param note1
	 * @param note2
	 * @return la moyenne de note1 et note2
	 * @throws BadAttributeValueExpException si note1 ou note2 < 0
	 */
	public double moyenne(double note1, double note2) throws BadAttributeValueExpException{
		if(note1 < 0){
			throw new BadAttributeValueExpException(note1);
		}
		if(note2 < 0){
			throw new BadAttributeValueExpException(note1);
		}
		return (note1 + note2) /2;
	}
}
