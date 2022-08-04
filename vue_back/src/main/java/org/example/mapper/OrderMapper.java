package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.Order;

public interface OrderMapper {
    @Select("select * from student where id = #{id}")
    Order findById(Long id);
}
