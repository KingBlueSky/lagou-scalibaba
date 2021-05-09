package com.xes.online.a.controller;

import com.xes.online.a.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jbwang0106
 * @time 2021/5/9 14:55
 * @description a
 */
@RestController
public class AController {

    @Autowired
    private BService bService;

    @GetMapping("test/a")
    public String TestA() {
        return "from a || " + bService.testB();
    }

}
