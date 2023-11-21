package com.sia.tacocloud.repository;

import com.sia.tacocloud.entity.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacoOrderRepository extends JpaRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
