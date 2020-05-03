package com.atguigu.springcloud.service;

import com.atguigu.springcloud.Utils.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * @author : liujun
 * @date : ${DATA}
 */

@FeignClient(value = "MICROSERVICECLOUD-ORDERSECKILL",fallbackFactory =SeckillClientServiceFallbackFactory.class)
public interface SeckillClientService
{
    @RequestMapping("/order/doMiaosha")
    public Result<String> doMiaosha(String miaoshagoods_id);

}