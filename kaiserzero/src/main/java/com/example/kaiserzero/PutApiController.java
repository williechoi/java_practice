package com.example.kaiserzero;

import com.example.kaiserzero.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    /**
     * {
     * "name": "willie",
     * "age" : 25,
     * "car_list": [
     * {
     * "name": "BMW",
     * "car_number": "111가 1111"
     * },
     * {
     * "name": "MayBach",
     * "car_number": "222가 7777"
     * },
     * ]
     * }
     *
     * @return requestData
     */
    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestData, @PathVariable(name="userId") Long id) {
        System.out.println(id);
        return requestData;
    }
}

