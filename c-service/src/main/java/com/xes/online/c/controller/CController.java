package com.xes.online.c.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jbwang0106
 * @time 2021/5/9 14:48
 * @description c
 */
@RestController
public class CController {

    @GetMapping("test/c")
    public String testC() {
        return "from c";
    }
}
