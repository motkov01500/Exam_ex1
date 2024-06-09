package org.example;

public class Food extends Sales {

    private int amount;

    public Food(String name, String uniqueNumber, int amount, Double price) {
        super(name, uniqueNumber, price);
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getIndex() + "." + getName() + "," + getPrice() + "," + getUniqueNumber() + "," + getAmount() + "," + getAdditionalComment();
    }
}