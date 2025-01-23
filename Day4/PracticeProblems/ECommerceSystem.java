import java.util.ArrayList;

class Order{

    String orderName;
    ArrayList<Product> products;

    Order(String orderName){
        this.orderName=orderName;
        this.products = new ArrayList<>();
    }

    public void showProducts() {
        for(Product p:products){
            System.out.println("For order "+this.orderName+" Product is "+p.productName);
        }
    }

    public void addProducts(Product... product){
        for (Product p:product){
            products.add(p);
        }
    }
}

class Customer1{

    public String customerName;
    public ArrayList<Order> orders;

    Customer1(String customerName){
        this.customerName=customerName;
        this.orders = new ArrayList<>();
    }

    public void showOrders() {
        for(Order o:orders){
            System.out.println("For customer " + this.customerName+" Order is "+o.orderName);
        }
    }

    public void placeOrder(Order order){
        orders.add(order);
    }

}

class Product{

    String productName;

    Product(String productName){
        this.productName=productName;
    }

}

public class ECommerceSystem {
    public static void main(String[] args) {

        Customer1 customer1 = new Customer1("Deepansh");
        Customer1 customer2 = new Customer1("Anubhav");

        Product product1 = new Product("Laptop");
        Product product2 = new Product("RAM");
        Product product3 = new Product("SSD");
        Product product4 = new Product("HDD");
        Product product5 = new Product("Graphics Card");

        Order order1 = new Order("List1");
        Order order2 = new Order("List2");

        order1.addProducts(product1,product2);
        order2.addProducts(product3,product4,product5);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        customer1.showOrders();
        order1.showProducts();

        customer2.showOrders();
        order2.showProducts();
    }
}
