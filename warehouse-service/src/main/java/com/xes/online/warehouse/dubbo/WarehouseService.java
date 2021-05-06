package com.xes.online.warehouse.dubbo;

import com.xes.online.warehouse.dto.Stock;

/**
 * @author jbwang0106
 * @time 2021/5/6 23:56
 * @description warehouse-service
 */
public interface WarehouseService {

    Stock getStock(Long skuId);
}
