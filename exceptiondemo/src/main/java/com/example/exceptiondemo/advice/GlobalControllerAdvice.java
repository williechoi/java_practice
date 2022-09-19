package com.example.exceptiondemo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e) {
        System.out.println("Invalid method argument(s) were given.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hey, mind your arguments! Are you nuts?");
    }

    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity nullPointException(NullPointerException e) {
        System.out.println("Null Point Exception");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hey, I can't consume null values! Are you crazy?");
    }

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity httpMessageNotReadableException(HttpMessageNotReadableException e) {
        System.out.println("Body text is not readable");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hey, I can't read your body document! Go away and think twice!");
    }

    // will catch all exceptions!
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity exception(Exception e) {
        System.out.println(e.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hey, your mistake is so stupid that I can't even identify what you did!");
    }

}
