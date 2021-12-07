package com.group12.bookstore.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
@TableName("orderbase")
public class Order {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private BigDecimal amount;
    private Date time;
    private String status;
    @TableField(exist = false)
    private OrderDetail orderDetail;
}
