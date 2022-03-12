package com.example.store.reponsitory;

import com.example.store.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartReponsitory extends JpaRepository<Cart,Integer> {

    @Query("SELECT c FROM Cart c WHERE c.id = :id1")
    Cart findAllById(@Param("id1") int id);
}
