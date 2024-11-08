package com.cakkie.backend.implement;

import com.cakkie.backend.dto.*;
import com.cakkie.backend.model.productItem;
import com.cakkie.backend.repository.ProductRepository;
import com.cakkie.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplement implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<productItem> getAllProductItems() {
        return productRepository.getAllProductItems();
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        return productRepository.getAllProduct();
    }
    @Override
    public List<Object[]> getAllProducts() {
        return productRepository.getAllProducts();
    }
    @Override
    public List<Object[]> getProductById(int id) {
        return productRepository.getProductById(id);
    }

    @Override
    public List<DescriptionDTO> getProductDescriptionsById(int id) {
        return productRepository.getProductDescriptionsById(id);
    }

//    @Override
//    public List<ProductDTO> getProductsById(int id) {
//        return productRepository.getProductsById(id);
//    }

    @Override
    public List<Object[]> getProductDescriptionById(int id) {
        return productRepository.getProductDescriptionById(id);
    }

    @Override
    public CouponDTO getCouponById(int id) {
        return productRepository.getCouponById(id);
    }

    @Override
    public List<productCartDTO> getProductCart(int userId) {
        return productRepository.getProductCart(userId);
    }

    @Override
    public List<AddressDTO> getAddressById(int userId) {
        return productRepository.getAddressById(userId);
    }

    @Override
    public List<ProductDTO> getProductItemById(int productId) {
        return productRepository.getProductItemById(productId);
    }

    @Override
    public List<OrderDTO> getOrdersByUserId(int userId) {
        return productRepository.getOrdersByUserId(userId);
    }

    @Override
    public List<OrderItemDTO> getOrderItemsByOrderId(int orderId) {
        return productRepository.getOrderItemsByOrderId(orderId);
    }

    @Override
    public List<CouponDTO> getCoupons() {
        return productRepository.getCoupons();
    }

    @Override
    public List<ShippingMethodDTO> getShippingMethod() {
        return productRepository.getShippingMethod();
    }

    @Override
    public List<PaymentMethodDTO> getPaymentMethods() {
        return productRepository.getPaymentMethods();
    }

}