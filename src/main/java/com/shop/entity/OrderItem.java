package com.shop.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class OrderItem extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "order_item_id") // 주문내역에있는 아이템의 id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")  // 상품의 id
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id") // 오더의 id
    private Order order;

    private int orderPrice; // 주문 가격
    private int count; // 수량

//    private LocalDateTime regTime;
//    private LocalDateTime updateTime;

}



