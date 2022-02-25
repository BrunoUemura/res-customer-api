package dev.restaurant.rescustomerapi.controller;

import dev.restaurant.rescustomerapi.entity.Order;
import dev.restaurant.rescustomerapi.entity.OrderDetail;
import dev.restaurant.rescustomerapi.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/order")
@AllArgsConstructor
public class OrderController {

    private OrderService orderService;

    @GetMapping(path = "/table_id/{tableId}")
    public OrderDetail getOrderDetail(@PathVariable String tableId) {
        return this.orderService.getOrderDetail(tableId);
    }
}
