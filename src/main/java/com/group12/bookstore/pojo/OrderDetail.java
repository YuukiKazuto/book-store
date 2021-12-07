package com.group12.bookstore.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("orderdetail")
public class OrderDetail {
    private Integer orderId;
    private Integer bookId;
    private Integer shoppingNum;
}
