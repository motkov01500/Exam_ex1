package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SalesRepository {

    private List<Sales> createdSales = new ArrayList<>();

    private static SalesRepository INSTANCE;

    private SalesRepository() {}

    public static SalesRepository getInstance() {
        if(INSTANCE == null) {
            INSTANCE =  new SalesRepository();
        }
        return INSTANCE;
    }

    public List<Sales> getCreatedSales() {
        return createdSales;
    }

    public void addSale(Sales sale) {
        createdSales.add(sale);
    }

    public Sales findByUniqueNumber(String uniqueNumber) {
        List<Sales> findedSale = createdSales
                .stream()
                .filter(sale-> sale.getUniqueNumber().equals(uniqueNumber))
                .collect(Collectors.toList());
        if(findedSale.isEmpty()) {
            throw new NullPointerException("Sale with following unique number:" + uniqueNumber + "does not exist");
        }
        return findedSale.get(0);
    }
}
