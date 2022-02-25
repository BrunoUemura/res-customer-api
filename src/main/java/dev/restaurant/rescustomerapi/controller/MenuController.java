package dev.restaurant.rescustomerapi.controller;

import dev.restaurant.rescustomerapi.entity.Menu;
import dev.restaurant.rescustomerapi.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/menu")
@AllArgsConstructor
public class MenuController {
    private MenuService menuService;

    @GetMapping
    public List<Menu> getAllMenu() {
        return this.menuService.getAllMenu();
    }

    @GetMapping(path = "/category/{category}")
    public List<Menu> getMenuByCategory(@PathVariable String category) {
        return this.menuService.getMenuByCategory(category);
    }
}
