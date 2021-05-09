package com.xes.online.a.service;

import org.checkerframework.checker.fenum.qual.Fenum;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jbwang0106
 * @time 2021/5/9 14:55
 * @description b
 */
@FeignClient("b-service")
public interface BService {

    @GetMapping("test/b")
    String testB();
}
