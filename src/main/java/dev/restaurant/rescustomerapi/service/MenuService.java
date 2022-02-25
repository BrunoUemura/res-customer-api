package dev.restaurant.rescustomerapi.service;

import dev.restaurant.rescustomerapi.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    public List<Menu> getAllMenu() {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu("123", "dish1", "1212", 12, "main dish"));
        menu.add(new Menu("456", "dish2", "2121", 21, "main dish"));
        return menu;
    }

    public List<Menu> getMenuByCategory(String category) {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu("789", "dish3", "1212", 12, "main dish"));
        menu.add(new Menu("987", "dish4", "2121", 21, "main dish"));
        return menu;
    }
}
