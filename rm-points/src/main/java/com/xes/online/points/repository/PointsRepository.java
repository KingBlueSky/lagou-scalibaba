package com.xes.online.points.repository;

import com.xes.online.points.entity.Points;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jbwang0106
 * @time 2021/5/9 21:37
 * @description 1
 */
public interface PointsRepository extends JpaRepository<Points, Integer> {
}
