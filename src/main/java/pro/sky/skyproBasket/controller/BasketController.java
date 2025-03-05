package pro.sky.skyproBasket.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyproBasket.service.BasketServiceImpl;

import java.awt.*;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private final BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List addObject(@RequestParam int code) {
        return basketService.add(code);
    }

    @GetMapping("/get")
    public Collection <Integer> getObjects() {
        return basketService.get();

    }
}