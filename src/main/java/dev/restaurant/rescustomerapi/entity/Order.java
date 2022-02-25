package dev.restaurant.rescustomerapi.entity;

import java.util.List;

public class Order {
    private String table_id;
    private List<Menu> order;

    public Order(String table_id, List<Menu> order) {
        this.table_id = table_id;
        this.order = order;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
    }

    public List<Menu> getOrder() {
        return order;
    }

    public void setOrder(List<Menu> order) {
        this.order = order;
    }
}
