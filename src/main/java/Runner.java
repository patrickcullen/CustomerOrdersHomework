import db.DBCustomer;
import db.DBHelper;
import db.DBOrder;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Curtis", "Wentworth", 44);
        Customer customer2 = new Customer("Eric", "Pearson", 48);

        DBHelper.save(customer1);
        DBHelper.save(customer2);
        Order order1 = new Order("Order Stuff", 11, 44, customer1);
        DBHelper.save(order1);
        Order order2 = new Order("More Order Stuff", 12, 48, customer1);
        DBHelper.save(order2);

//        DBHelper.delete(order1);

//        customer1.setAge(38);
//        DBHelper.update(customer1);

//        DBCustomer.delete(customer2);
//        List<Order> orders = DBOrder.getOrders();
    }


}
