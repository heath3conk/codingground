public class Recipe{

    private String name;
    private Map<Ingredient, int> details;
    private double recipeCost;
    
    // a Recipe has a name, a map of ingredients & quantities, and a total cost
    Recipe(String name, Map<Ingredient, int> details) {
        this.name = name;
        this.details = details;
        this.recipeCost = totalCost();
    }
    
    // totalCost: calculate based on Recipe map
    private double totalCost() {
        double cost = 0.0;
        this.details.forEach((ingredient, amount) -> {
            cost+=ingredient.cost * amount;
        });
        return cost;
    }
}
