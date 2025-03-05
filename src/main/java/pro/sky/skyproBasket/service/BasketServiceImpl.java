package pro.sky.skyproBasket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private   List <Integer> basket;
    public BasketServiceImpl() {
        this.basket = new ArrayList<>();
    }

    @Override
    public List add(int code) {
        basket.add(code);
        return basket;
    }
    @Override
    public Collection<Integer> get() {
        return Collections.unmodifiableList(basket);
    }
}