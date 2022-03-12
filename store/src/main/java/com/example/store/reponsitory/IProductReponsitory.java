package com.example.store.reponsitory;

import com.example.store.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductReponsitory extends JpaRepository<Product,Integer> {
    @Query("SELECT new Product(p.id,p.name) FROM Product p INNER JOIN p.cart c WHERE c.id = :id1")
    List<Product> findAllById(@Param("id1") int id);
}
