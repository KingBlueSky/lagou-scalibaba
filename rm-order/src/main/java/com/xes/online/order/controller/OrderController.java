package com.xes.online.order.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xes.online.order.entity.Order;
import com.xes.online.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jbwang0106
 * @time 2021/5/9 19:38
 * @description controller
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("create_order")
    public String createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer points, Integer quantity) throws JsonProcessingException {
        Map<String, Object> result = new HashMap<>(3);
        Order order = orderService.createOrder(orderId, memberId, goodsId, points, quantity);
        result.put("code", "0");
        result.put("message", "create order success");
        return new ObjectMapper().writeValueAsString(result);
    }
}
