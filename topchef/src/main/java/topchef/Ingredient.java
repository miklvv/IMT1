package topchef;

public abstract class Ingredient {
	public int id;
	public String nom;
	public int calories;
	public boolean bio;
	public boolean coupe;
	public boolean cuit;
	
	public Ingredient(int id, String nom, int calories, boolean bio, boolean coupe, boolean cuit) {
		this.id=id;
		this.nom=nom;
		this.calories=calories;
		this.bio=bio;
		this.coupe=coupe;
		this.cuit=cuit;
	}
}
class Epice extends Ingredient{
	Epice(int id, String nom, int calories, boolean bio, boolean coupe, boolean cuit){
		super(id,nom,0,bio,coupe,cuit);
	}
}
class Viande extends Ingredient{
	int tauxGras;
	Viande(int id,String nom, int calories, boolean bio, boolean coupe, boolean cuit, int tauxGras){
		super(id,nom,calories,bio,coupe,cuit);
		this.tauxGras=tauxGras;
	}
}
class Legume extends Ingredient{
	int tauxFibre;
	Legume(int id, String nom, int calories, boolean bio, boolean coupe, boolean cuit, int tauxFibre){
		super(id, nom,calories,bio,coupe,cuit);
		this.tauxFibre=tauxFibre;
	}
}
class Autres extends Ingredient{
	Autres(int id,String nom, int calories, boolean bio, boolean coupe, boolean cuit){
		super(id, nom,calories,bio,coupe,cuit);
	}
}



