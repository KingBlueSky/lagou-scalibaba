package com.xes.online.order.repository;

import com.xes.online.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jbwang0106
 * @time 2021/5/9 19:34
 * @description dao
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
