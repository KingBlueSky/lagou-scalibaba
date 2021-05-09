package com.xes.online.b.controller;

import com.xes.online.b.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jbwang0106
 * @time 2021/5/9 14:52
 * @description b
 */
@RestController
public class BController {

    @Autowired
    private CService cService;

    @GetMapping("test/b")
    public String testB() {
        return "from b || " + cService.testC();
    }
}
