public class Ingredient{

    // an Ingredient has a name and a cost
    private String name;
    private double cost;
    
    Ingredient(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    // build specific Ingredients
    public static void main(String[] args) {
        Ingredient coffee = new Ingredient("Coffee", 0.75);
        Ingredient decaf = new Ingredient("Decaf Coffee", 0.75);
        Ingredient sugar = new Ingredient("Sugar", 0.25);
        Ingredient cream = new Ingredient("Cream", 0.25);
        Ingredient steamedMilk = new Ingredient("Steamed Milk", 0.35);
        Ingredient foamedMilk = new Ingredient("Foamed Milk, 0.35);
        Ingredient espresso = new Ingredient("Espresso", 1.1);
        Ingredient cocoa = new Ingredient("Cocoa", 0.9);
        Ingredient whippedCream = new Ingredient("Whipped Cream", 1.0);
   }
    
}
