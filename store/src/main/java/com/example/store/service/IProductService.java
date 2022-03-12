package com.example.store.service;

import com.example.store.domain.Cart;
import com.example.store.domain.Product;

import java.util.List;

public interface IProductService {
    void save(int id, String name, Cart cart);
    List<Product> getAllProductByIdCart(int id);
}
