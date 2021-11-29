package com.shop.repository;


import com.shop.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRespository extends JpaRepository<Cart, Long> {


}
