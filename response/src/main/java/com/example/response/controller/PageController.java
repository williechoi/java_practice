package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // Response Entity
    // Response Body Annotation을 통해 Page Controller에서도 JSON Body를 내려보낼 수 있다.
    // 보통은 Rest Controller를 따로 만드는 것이 기본이다. (Page Controller에서는 페이지만 내려보냄)
    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("Willie");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
