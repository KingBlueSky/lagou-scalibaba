package com.xes.online.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jbwang0106
 * @time 2021/5/9 19:27
 * @description order
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "`order`")
public class Order {

    public Order(Integer id, Integer memberId, Integer goodsId, Integer points, Integer quantity) {
        this.id = id;
        this.memberId = memberId;
        this.points = points;
        this.goodsId = goodsId;
        this.quantity = quantity;
    }

    /**
     * 订单编号
     */
    @Id
    @Column(name = "order_id")
    private Integer id;

    /**
     * 会员编号
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 商品编号
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 新增积分
     */
    private Integer points;

    /**
     * 销售数量
     */
    private Integer quantity;


}
