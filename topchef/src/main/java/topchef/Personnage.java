package topchef;

public abstract class Personnage {
	public int id;
	public String nom;
	public String prenom;
	public enum Genre{
		homme,
		femme,
		autre
	};
	public Genre genre;
	public String telephone;
	
	public Personnage(int id,String nom,String prenom,Genre genre,String telephone){
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.genre=genre;
		this.telephone=telephone;
	}
	public String toString() {
		return "id: "+ id+ " nom: "+nom+ " prenom: "+ prenom+ " genre: "+ genre + " telephone: "+ telephone;
	}
	
}

class Chef extends Personnage{
	int nbEtoiles;
	enum Specialites{
		cuisinier,
		patissier,
		travailADistance
	}
	Specialites specialites;
	Plat plats;
	Padawan padawan;
	
	Chef(int id,String nom,String prenom,Genre genre,String telephone, int nbEtoiles, Specialites specialites, Plat plats, Padawan padawan){
		super(id,nom,prenom,genre,telephone);
		this.nbEtoiles=nbEtoiles;
		this.specialites=specialites;
		this.plats=plats;
		this.padawan=padawan;
	}
	public String toString() {
		return super.toString()+ nbEtoiles + " specialites: " + specialites + " plats: " + (plats !=null ? plats.toString(): "Aucun") + " padawans: " + (padawan != null? padawan.toString(): "Aucun");
	}
}
class Padawan extends Personnage{
	Chef chef;
	Padawan(int id,String nom,String prenom,Genre genre,String telephone, Chef chef){
		super(id,nom,prenom,genre,telephone);
		this.chef=chef;
	}
	public String toString() {
		return super.toString()+ " chef: "+ chef;
	}
}
class Jury extends Personnage{
	int nbJury;
	Concours concours;
	Jury(int id,String nom,String prenom,Genre genre,String telephone, int nbJury, Concours concours){
		super(id,nom,prenom,genre,telephone);
		this.nbJury=nbJury;
		this.concours=concours;
	}
	/*
	public String toString() {
		return super.toString()+ " nombre de jurys: "+nbJury+ " concours: "+concours;
	}
	*/
}

