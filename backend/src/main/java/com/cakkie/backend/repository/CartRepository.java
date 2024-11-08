package com.cakkie.backend.repository;

import com.cakkie.backend.model.shoppingCartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<shoppingCartItem, Integer> {

    @Query(value = "SELECT pi.shoppingCartItemsList " +
            "FROM productItem pi " +
            "JOIN pi.shoppingCartItemsList pc " +
            "JOIN pc.cartId spc " +
            "WHERE pi.id = :productId AND spc.id = :cartId")
    shoppingCartItem findCartItem(@Param("cartId") Integer cartId, @Param("productId") Integer productId);


    @Query("SELECT pc FROM shoppingCartItem pc WHERE pc.id = :id")
    shoppingCartItem getProductCartById(@Param("id") Integer id);
}
