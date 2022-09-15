package com.example.validation.controller;

import com.example.validation.dto.DailySales;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/sales")
    public ResponseEntity sales(@RequestBody DailySales sales) {
        if (sales.getInfoId() != 3) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sales);
        }

        return ResponseEntity.ok(sales);
    }

}
