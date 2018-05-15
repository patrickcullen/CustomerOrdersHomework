package models;

public class Order {

    private String description;
    private int amount;
    private int total;
    private int id;

    public Order(String description, int amount, int total) {
        this.description = description;
        this.amount = amount;
        this.total = total;
    }

    public Order(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
