package com.example.store.service;

import com.example.store.domain.Cart;
import com.example.store.reponsitory.ICartReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{
    @Autowired
    private ICartReponsitory cartReponsitory;

    @Override
    public void save(int id, String name) {
        cartReponsitory.save(new Cart(id,name));
    }

    @Override
    public Cart getCartById(int id) {
        Cart cart = cartReponsitory.findAllById(id);
        return cart;
    }
}
