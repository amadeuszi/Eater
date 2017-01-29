import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Init.init();
		Operations operations = new Operations();
		ArrayList<String> x = new ArrayList<>();
		ArrayList<Double> y = new ArrayList<>();
		operations.addIngredient("fish", "gram", 12.0, 200.0);
		operations.addIngredient("potatoes", "gram", 0.7, 500.0);
		operations.updateTranslator();
		x.add("fish");
		y.add(150.0);
		x.add("potatoes");
		y.add(200.0);
		operations.addRecipie("Fish and chips", "Fish to the oven for 30 mins, fry chips on pan for 10 mins", x, y);
		operations.showRecipies();
		operations.addRecipies();
		operations.updateMyShelf();
		operations.createShoppingList();
		operations.user.showShoppingList();
		operations.convertFromShoppingListToProductList();
		operations.user.showProductList();
		
		operations.close();
	}
}
