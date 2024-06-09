package org.example;

import java.text.DecimalFormat;

public abstract class Sales implements Comparable<Sales> {

    private static int index = 0;
    private int saleIndex;
    private String name;
    private String uniqueNumber;
    private Double price;
    private String additionalComment;

    public Sales(String name, String uniqueNumber, Double price) {
        index += 1;
        saleIndex = index;
        this.name = name;
        this.uniqueNumber = uniqueNumber;
        this.price = price;
    }

    public Integer getIndex() {
        return saleIndex;
    }

    public String getName() {
        return name;
    }

    public String getAdditionalComment() {
        if(additionalComment == null) {
            return "";
        }
        return additionalComment;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAdditionalComment(String additionalComment) {
        this.additionalComment = additionalComment;
    }

    @Override
    public int compareTo(Sales b) {
        return this.price.compareTo(b.getPrice());
    }
}