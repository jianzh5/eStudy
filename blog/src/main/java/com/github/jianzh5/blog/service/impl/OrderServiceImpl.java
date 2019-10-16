package com.github.jianzh5.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.jianzh5.blog.entity.Order;
import com.github.jianzh5.blog.mapper.OrderMapper;
import com.github.jianzh5.blog.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * 订单实现层
 * @author jianzh5
 * @date 2019/10/15 17:05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
