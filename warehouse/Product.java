package warehouse;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class Product {
    private final String productID;
    private final String name;
    private int quantity;
    private final Location location;

    public Product(String productID, String name, int quantity, Location location) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.location = location;
    }

    public String getProductID() { return productID; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Location getLocation() { return location; }
}

