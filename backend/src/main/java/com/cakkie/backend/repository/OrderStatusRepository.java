package com.cakkie.backend.repository;

import com.cakkie.backend.model.orderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<orderStatus, Integer>  {
}
