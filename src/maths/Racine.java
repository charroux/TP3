package maths;

public class Racine {
	
	private double precision;

	public Racine(double precision){
		this.precision=precision;
	}
	
	public double racine(double operande) throws RacinneException{
		
		if(operande < 0){
			throw new RacinneException(operande + " <0. Attention ! Doit être >=0");	
		}		
		 double solution, carre, a, b;
		 a=0;
		 b=operande;
		 solution=(a+b)/2;
		 while(b-a>precision){
			 carre=solution*solution;
			 if (carre>operande) b=solution;
			 else a=solution;
			 solution=(a+b)/2;
		}
		return solution;
		
	}
	
	public double getPrecision() { 
		return precision; 
	}
	
	public void setPrecision(double precision) { 
		this.precision=precision; 
	}

}
