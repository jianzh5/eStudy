package com.github.jianzh5.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 订单实体表
 */
@Data
@TableName("t_order")
public class Order {
    private Long id;

    private String name;

    private String type;

    private Date gmtCreate;

}
