package com.example.store.service;

import com.example.store.domain.Cart;

public interface ICartService {
    void save(int id, String name);
    Cart getCartById(int id);
}
