package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalesService salesService = SalesService.getInstance();
        salesService.addSale(new Food("Banitsa", "123asd", 2, 5.33));
        salesService.addSale(new Service("Cleaning", "123fbasd", "Good job", 25.32));
        salesService.addSale(new Food("Banitsa", "123b13", 2, 10.33));
//        salesService.printSales();
        salesService.editAmount("123asd", 5);
        salesService.editAdditionalComment("123fbasd", "testtest");
        salesService.printSales();
        System.out.println(salesService.findCheapestSale());
    }
}