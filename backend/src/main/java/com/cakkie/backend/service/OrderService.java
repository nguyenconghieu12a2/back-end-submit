package com.cakkie.backend.service;

import com.cakkie.backend.dto.OrderDTO;
import com.cakkie.backend.model.shopOrder;

public interface OrderService {
    shopOrder createOrder(OrderDTO order);
}
