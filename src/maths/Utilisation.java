package maths;

import javax.management.BadAttributeValueExpException;

public class Utilisation {

	public static void main(String[] args) {
		
		double result1 = 0;
		double result2 = 0;
		
		try{
			
			Statistique stats = new Statistique();
			result1 = stats.moyenne(1, 3);
			
			result2 = stats.moyenne(-1, 3);
			
		}catch(BadAttributeValueExpException e){
			e.printStackTrace();
		}
		
		System.out.println(result1 + " " + result2);
		

	}

}
