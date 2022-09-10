package com.example.kaiserzero;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api2")

public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);

        //delete -> 리소스 삭제 리소스가 없더라도 200 OK 리턴
    }
}
