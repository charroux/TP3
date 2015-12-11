package football;

public class Joueur extends Acteur{

	String club;
	double salaire;
	
	public Joueur(String club, double euroMillions, String nom, String prenom, int age) {
		super(nom, prenom, age);
		this.club = club;
		this.salaire = Math.random() * euroMillions;
	}
	
	public Joueur(double euroMillions, String nom, String prenom, int age) {
		this("Knysna Syndrome Club", euroMillions, nom, prenom, age);
	}

	public String getClub() {
		return club;
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

	@Override
	public String toString() {
		return "Joueur [club=" + club + ", salaire=" + salaire
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
