package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class SalesService {

    private static SalesService INSTANCE;
    private SalesRepository salesRepository = SalesRepository.getInstance();

    private SalesService() {}

    public void addSale(Sales sale) {
        salesRepository.addSale(sale);
    }

    public static SalesService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SalesService();
        }
        return INSTANCE;
    }

    public void editAmount(String uniqueNumber, int amount) {
        Sales finded = salesRepository.findByUniqueNumber(uniqueNumber);
        if (finded instanceof Food) {
            Food food = (Food) finded;
            food.setAmount(amount);
        } else {
            System.out.println("For amount please choose food, no service");
        }
    }

    public void editAdditionalComment(String uniqueNumber, String additionalComment) {
        Sales finded = salesRepository.findByUniqueNumber(uniqueNumber);
        finded.setAdditionalComment(additionalComment);
    }

    public Double sumAllSales() {
        Double sum = 0.0;
        for (Sales sale : salesRepository.getCreatedSales()) {
            sum += sale.getPrice();
            if(sale instanceof Food) {
                Food currentSale = (Food) sale;
                sum += (currentSale.getAmount() - 1) * currentSale.getPrice();
            }
        }
        return sum;
    }

    public Sales findCheapestSale() {
        List<Sales> sales = salesRepository.getCreatedSales();
        Collections.sort(sales);
        return sales.get(0);
    }

    public void printSales() {
        List<Sales> sortedCollection = salesRepository.getCreatedSales();
        Collections.sort(sortedCollection);
        for(Sales item: sortedCollection) {
            System.out.println(item);
        }
    }
}
