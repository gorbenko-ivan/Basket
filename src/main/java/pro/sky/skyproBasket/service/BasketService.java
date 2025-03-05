package pro.sky.skyproBasket.service;


import java.util.Collection;
import java.util.List;

public interface BasketService {

    List add(int code);

    Collection<Integer> get();
}