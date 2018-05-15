import db.DBCustomer;
import db.DBOrder;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Order order1 = new Order("Order Stuff", 11, 44);
        Order order2 = new Order("More Order Stuff", 12, 48);

        DBOrder.save(order1);
        DBOrder.save(order2);

//        Customer customer1 = new Customer("Curtis", "Wentworth", 44);
//        Customer customer2 = new Customer("Eric", "Pearson", 48);
//
//        DBCustomer.save(customer1);
//        DBCustomer.save(customer2);

        DBOrder.delete(order1);

//        customer1.setAge(38);
//        DBCustomer.update(customer1);
//
//        DBCustomer.delete(customer2);
        List<Order> orders = DBOrder.getOrders();
    }


}
