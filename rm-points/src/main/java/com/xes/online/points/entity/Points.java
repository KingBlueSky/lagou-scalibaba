package com.xes.online.points.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jbwang0106
 * @time 2021/5/9 21:35
 * @description points
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "points")
public class Points {

    @Id
    @Column(name = "member_id")
    private Integer memberId;

    private Integer points;
}
