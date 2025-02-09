package warehouse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WarehouseSystem {
	public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product("P1", "Laptop", 10, new Location(1, 2, 3)));
        manager.addProduct(new Product("P2", "Phone", 5, new Location(2, 3, 4)));

        List<String> products1 = Arrays.asList("P1", "P2");
        List<String> products2 = Collections.singletonList("P1");
        manager.placeOrder(new Order("O1", products1, Order.Priority.EXPEDITED));
        manager.placeOrder(new Order("O2", products2, Order.Priority.STANDARD));

        manager.processOrders();
    }

}
