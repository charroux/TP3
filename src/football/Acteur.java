package football;

public abstract class Acteur {
	
	private final String nom;
	private final String prenom;
	private int age;
	
	public Acteur(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public abstract double getSalaire();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ "]";
	}

}
