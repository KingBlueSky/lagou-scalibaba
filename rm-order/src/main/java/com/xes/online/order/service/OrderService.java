package com.xes.online.order.service;

import com.xes.online.order.entity.Order;
import com.xes.online.order.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;

/**
 * @author jbwang0106
 * @time 2021/5/9 19:35
 * @description service
 */
@Slf4j
@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Transactional
    public Order createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer points, Integer quantity) {
        Order order = new Order(orderId, memberId, goodsId, points, quantity);
        log.info("order: {}", order);
        return orderRepository.save(order);
    }
}
