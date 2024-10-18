package topchef;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//ingredients
		Viande jambon = new Viande(1,"jambon", 100,true, false, true, 6);
		Autres sauceTomate=new Autres(2,"sauce tomate", 300, false,false, true);
		Legume champignons=new Legume(3, "champignons", 100, false, false, true, 10);
		Autres mozzarella=new Autres(2,"mozzarella", 200, false,false, true);
		//Plats
		ArrayList<Ingredient> ingredientsPizza= new ArrayList<>();
		ingredientsPizza.add(sauceTomate);
		ingredientsPizza.add(jambon);
		ingredientsPizza.add(champignons);
		ingredientsPizza.add(mozzarella);
		Plat pizza = new Plat("Pizza", ingredientsPizza);
		//Personnages
		Padawan Louis = new Padawan(2,"Courteille","Louis",Personnage.Genre.homme,"0964528849", null);
		Chef Robert = new Chef(1,"Robert","Kermol", Personnage.Genre.autre, "0674927492",0, Chef.Specialites.cuisinier, pizza, Louis);
		Louis.chef=Robert;
		//Void
		System.out.println(Robert);
		System.out.println(Louis);
		System.out.println(pizza);
	}
}

