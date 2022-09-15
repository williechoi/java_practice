package com.example.validation.validator;

import com.example.validation.annotation.YearMonthDay;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthDayValidator implements ConstraintValidator <YearMonthDay, String> {

    private String pattern;

    @Override
    public void initialize(YearMonthDay constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println("isValid!");
        /// yyyy-MM-dd
        try {
            LocalDate localDate = LocalDate.parse(value, DateTimeFormatter.ofPattern(this.pattern));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
