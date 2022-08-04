package org.example.clients;

import org.example.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("localhost")
public interface UserClient {

    @GetMapping("/user/{id}")
    Student findById(long id);
}
