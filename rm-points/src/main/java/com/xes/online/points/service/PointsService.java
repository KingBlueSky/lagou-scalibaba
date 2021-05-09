package com.xes.online.points.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xes.online.points.entity.Points;
import com.xes.online.points.repository.PointsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Objects;
import java.util.Optional;

/**
 * @author jbwang0106
 * @time 2021/5/9 21:33
 * @description service
 */
@Service
@Slf4j
public class PointsService {

    @Resource
    private PointsRepository pointsRepository;

    @Transactional
    public Points addPoints(Integer memberId, Integer points) throws JsonProcessingException {
        Points entity = pointsRepository.findById(memberId).get();
        entity.setPoints(entity.getPoints() + points);
        return pointsRepository.save(new Points(memberId, entity.getPoints()));
    }
}
