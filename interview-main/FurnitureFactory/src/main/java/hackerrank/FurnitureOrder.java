package hackerrank;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    Map<Furniture, Integer> order;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.order = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        order.computeIfPresent(type, (k,v) -> v + furnitureCount);
        order.computeIfAbsent(type, k -> furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return (HashMap<Furniture, Integer>) this.order;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        
        float totalCost = 0;
        
        for (Map.Entry<Furniture,Integer> entry: this.order.entrySet()) {
            totalCost += entry.getKey().cost() * entry.getValue();
        }
        
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        Integer count = order.get(type);
        return (count == null) ? 0 : count;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        
        return type.cost() * this.getTypeCount(type);
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        
        int sum = 0;
        
        for(Map.Entry<Furniture,Integer> entry: this.order.entrySet()) {
            sum += entry.getValue();
        }
        
        return sum;
    }
}