package com.raddzio.plansandprices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PriceZoneNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(PriceZoneNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String priceZoneNotFoundHandler(PriceZoneNotFoundException e) {
        return e.getMessage();
    }
}