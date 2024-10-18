package topchef;
import java.util.ArrayList;

public class Plat {
	String plat;
	ArrayList<Ingredient> ingredients;
	Plat(String plat,ArrayList<Ingredient> ingredients) {
		this.plat=plat;
		this.ingredients=ingredients;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Plat :").append(plat).append("\ningredients : ");
		for(Ingredient ingredient : ingredients ) {
			sb.append(ingredient.nom).append(", ");
		}
		if (sb.length()>0) sb.setLength(sb.length()-2);
		return sb.toString();
	}
}
