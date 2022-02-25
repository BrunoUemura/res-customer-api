package dev.restaurant.rescustomerapi.entity;

import java.util.List;

public class OrderDetail {
    private String table_id;
    private List<Menu> order;
    private String order_status;

    public OrderDetail(String table_id, List<Menu> menu, String order_status) {
        this.table_id = table_id;
        this.order = menu;
        this.order_status = order_status;
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

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}
