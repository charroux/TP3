package maths;

public class UtiliseRacine {
	
	public static void main(String[] argv){
		
		try{
		
			Racine extracteur = new Racine(0.01);
			double operande= (Double.valueOf(argv[0])).doubleValue();
			double valeurRacine;
			valeurRacine=extracteur.racine(operande);
			System.out.println(valeurRacine);
			System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
			extracteur.setPrecision(0.00001);
			valeurRacine=extracteur.racine(operande);
			System.out.println(valeurRacine);
			System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
			
		}catch(RacinneException e){
			e.printStackTrace();
		}
		
	 }

}
