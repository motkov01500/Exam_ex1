package org.example;

public class Service extends Sales {

    private String comment;

    public Service(String name, String uniqueNumber, String comment, Double price) {
        super(name, uniqueNumber, price);
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return getIndex() + "." + getName() + "," + getPrice() + "," + getUniqueNumber() + "," + getComment() + "," + getAdditionalComment();
    }
}

