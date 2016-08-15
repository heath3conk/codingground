public class Recipe{

    private String title;
    private Map<Ingredient, int> details;
    private double recipeCost;
    
    // a Recipe has a title, a map of ingredients & quantities, and a total cost
    Recipe(String title, Map<Ingredient, int> details) {
        this.title = title;
        this.details = details;
        this.recipeCost = totalCost();
    }
    
    // totalCost: calculate based on Recipe map
    private double totalCost() {
        double cost = 0.0;
        this.details.forEach((ingredient, quantity) -> {
            cost+=ingredient.cost * quantity;
        });
        return cost;
    }
    
    // build specific recipes
    public static void main(String[] args) {
        Map<Ingredient, int> coffeeData = new HashMap<Ingredient, int>;
        coffeeData.set(coffee, 3);
        coffeeData.set(sugar, 1);
        coffeeData.set(cream, 1);
        Recipe coffeeDrink = new Recipe("Coffee", coffeeData);
        
        Map<Ingredient, int> decafData = new HashMap<Ingredient, int>;
        decafData.set(decaf, 3);
        decarData.set(sugar, 1);
        decafData.set(cream, 1);
        Recipe decafDring = new Recipe("Decaf Coffee", decafData);
        
        Map<Ingredient, int> latteData = new HashMap<Ingredient, int>;
        latteData.set(espresso, 2);
        latteData.set(steamedMilk, 1);
        Recipe latte = new Recipe("Caffe Latte", latteData);
        
        Map<Ingredient, int> amerData = new HashMap<Ingredient, int>;
        amerData.set(espresso, 3);
        Recipe americano = new Recipe("Caffe Americano", amerData);
        
        Map<Ingredient, int> mochaData = new HashMap<Ingredient, int>;
        mochaData.set(espresso, 1);
        mochaData.set(cocoa, 1);
        mochaData.set(steamedMilk, 1);
        mochaData.set(whippedCream, 1);
        Recipe mocha = new Recipe("Caffe Mocha", mochaData);
        
        Map<Ingredient, int> cappucData = new HashMap<Ingredient, int>;
        cappucData.set(espresso, 2);
        cappucData.set(steamedMilk, 1);
        cappucData.set(foamedMilk, 1);
        Recipe cappuccino = new Recipe("Cappuccino", cappucData);
    }
}
