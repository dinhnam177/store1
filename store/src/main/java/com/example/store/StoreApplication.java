package com.example.store;

import com.example.store.domain.Cart;
import com.example.store.domain.Product;
import com.example.store.service.ICartService;
import com.example.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	@Autowired
	IProductService productService;

	@Autowired
	ICartService cartService;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		cartService.save(1,"sách");
		Cart cart = cartService.getCartById(1);
		System.out.println(cart.toString());
		List<Product> products = cart.getProducts();
		for (Product product: products){
			System.out.println(product.toString());
		}
//		productService.save(2,"đắc nhân tâm",cart);

//		List<Product> products = productService.getAllProductByIdCart(cart.getId());
//		for (Product product: products){
//			System.out.println(product.toString());
//		}
	}
}
