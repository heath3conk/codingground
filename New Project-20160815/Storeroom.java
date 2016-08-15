public class Storeroom{

    private List<Ingredient> supplyList
    private Map<Ingredient, int> inventory;
    private int maxCapacity;
    private String report;
    
    Storeroom(List<Ingredient> supplyList) {
        this.supplyList = supplyList;
        this.maxCapacity = 10;
        this.inventory = restock();
        this.report = "All good";
    }
    
    public static void restock(String[] args) {
        this.report = "All good"; // reset this value when restocking
        this.supplyList.forEach((ingredient) -> {
            this.inventory.set(ingredient, maxCapacity);
        });
    }
    
    public static void getSupplies(Recipe item) {
        if (item.details == null) { // presuming that trying to getSupplies for an invalid Recipe would produce 'null'
            this.report = "Invalid selection";
        }
        
        // Recipe.details is a map of Ingredients and quantities
        item.details.forEach((ingredient, quantityNeeded) -> {
            int currentQuantity = this.inventory.get(ingredient);
            if (currentQuantity >= quantityNeeded) {
                this.inventory.set(ingredient, currentQuantity-quantityNeeded);
            }
            else if (currentQuantity < quantityNeeded) {
                this.report = "Not enough in supply"; // change this value if any of the ingredients are too low
            }
            
        });
        
    }
}
