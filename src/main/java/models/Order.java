package models;

import javax.persistence.*;

@Entity
@Table(name="Orders")

public class Order {

    private String description;
    private int amount;
    private int total;
    private int id;
    private Customer customer;

    public Order(String description, int amount, int total, Customer customer) {
        this.description = description;
        this.amount = amount;
        this.total = total;
        this.customer = customer;

    }

    public Order(){

    }

    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="amount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Column(name="total")
    public int getTotal() {

        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
