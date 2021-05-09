package com.xes.online.b.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jbwang0106
 * @time 2021/5/9 14:49
 * @description c-s
 */
@FeignClient("c-service")
public interface CService {

    @GetMapping("test/c")
    public String testC();
}
