package warehouse;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryManager {   private final Map<String, Product> products = new ConcurrentHashMap<>();
private final PriorityQueue<Order> orderQueue = new PriorityQueue<>(Collections.reverseOrder());

public void addProduct(Product product) {
    products.put(product.getProductID(), product);
}

public void placeOrder(Order order) {
    orderQueue.offer(order);
}

public void processOrders() {
    ExecutorService executor = Executors.newFixedThreadPool(3);
    while (!orderQueue.isEmpty()) {
        Order order = orderQueue.poll();
        executor.execute(() -> fulfillOrder(order));
    }
    executor.shutdown();
}

private synchronized void fulfillOrder(Order order) {
    System.out.println("Processing order: " + order);
    for (String productID : order.getProductIDs()) {
        Product product = products.get(productID);
        if (product != null && product.getQuantity() > 0) {
            product.setQuantity(product.getQuantity() - 1);
            System.out.println("Dispatched: " + product.getName() + " from " + product.getLocation());
        } else {
            System.out.println("Out of Stock: " + productID);
        }
    }
}

}
