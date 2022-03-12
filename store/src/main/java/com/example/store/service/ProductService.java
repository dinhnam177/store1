package com.example.store.service;

import com.example.store.domain.Cart;
import com.example.store.domain.Product;
import com.example.store.reponsitory.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductReponsitory iProductReponsitory;

    @Override
    public void save(int id, String name, Cart cart) {
        iProductReponsitory.save(new Product(id,name,cart));
    }

    @Override
    public List<Product> getAllProductByIdCart(int id) {
        return getAllProductByIdCart(id);
    }
}
