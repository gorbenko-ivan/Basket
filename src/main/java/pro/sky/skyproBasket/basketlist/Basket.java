package pro.sky.skyproBasket.basketlist;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {

    private final int code;

    public Basket(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return code == basket.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "code=" + code +
                '}';
    }
}