package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sale {
    private List<SaleItem> itens = new ArrayList<>();

    public void createSaleItem(String code, int quantity) {
        SaleItem item = new SaleItem();
        item.createProduct(code, quantity);
        itens.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (SaleItem item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<SaleItem> getItens() {
        return new ArrayList<>(itens);
    }
}
