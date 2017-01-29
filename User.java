import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class User {
	private ArrayList<Integer> chosenRecipies;
	public Map<Integer, Double> shoppingList;
	public Map<Integer, Double> neededIngredients;
	public Map<Integer, Double> myShelf;
	public ArrayList<Product> productList;
	User() {
		chosenRecipies = new ArrayList<Integer>();
		shoppingList = new HashMap<Integer, Double>();
		neededIngredients = new HashMap<Integer, Double>();
		myShelf = new HashMap<Integer, Double>();
		productList = new ArrayList<>();
	}
	void addRecipie(int recipie) {
		chosenRecipies.add(recipie);
	}
	ArrayList<Integer> getChosenRecipies() {
		return chosenRecipies;
	}
	
	void convertToShoppingList() {
		shoppingList = new HashMap<Integer, Double>();
		for (Integer key : neededIngredients.keySet()) {
			Double howMuch = myShelf.getOrDefault(key, 0.0);
			shoppingList.put(key, Math.max(0.0, neededIngredients.get(key) - howMuch));
		}
	}
	
	void showShoppingList() {
		System.out.println("Shopping list: ");
		for (Integer key : shoppingList.keySet()) {
			System.out.println("What: " + key + ", How much: "  + shoppingList.get(key));
		}
	}
	
	void showProductList() {
		System.out.println("Product List: ");
		for (Product product : productList) {
			System.out.println(product);
		}
	}
}