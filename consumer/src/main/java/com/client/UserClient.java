package com.client;

import com.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider")

public interface UserClient {
    @RequestMapping("user/{id}")
    User findUser(@PathVariable("id") Long id);


}