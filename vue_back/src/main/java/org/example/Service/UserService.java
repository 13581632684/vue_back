package org.example.Service;

import org.example.clients.UserClient;
import org.example.mapper.OrderMapper;
import org.example.pojo.Order;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.用Feign远程调用
        Student student = userClient.findById(order.getId());
        // 3.封装user到Order
        order.setStudent(student);
        // 4.返回
        return order;
    }

}
