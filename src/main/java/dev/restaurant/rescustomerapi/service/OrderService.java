package dev.restaurant.rescustomerapi.service;

import dev.restaurant.rescustomerapi.entity.Menu;
import dev.restaurant.rescustomerapi.entity.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    public OrderDetail getOrderDetail(String tableId) {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu("1", "fries", "http://test", 10, "main dish"));
        menu.add(new Menu("2", "ice cream", "http://test", 5, "dessert"));
        return new OrderDetail(tableId, menu, "PREPARING");
    }
}
