package com.xes.online.points.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xes.online.points.service.PointsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jbwang0106
 * @time 2021/5/9 21:32
 * @description points
 */
@RestController
public class PointsController {

    @Resource
    private PointsService pointsService;

    @GetMapping("/add_points")
    public String addPoints(Integer memberId, Integer points) throws JsonProcessingException {
        Map<String, Object> result = new HashMap<>(3);
        pointsService.addPoints(memberId, points);
        result.put("code", "message");
        result.put("message", "add points success");
        return new ObjectMapper().writeValueAsString(result);
    }
}
