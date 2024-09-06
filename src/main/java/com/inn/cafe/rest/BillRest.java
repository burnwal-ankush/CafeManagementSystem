package com.inn.cafe.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping(path = "/bill")
public interface BillRest {

    @PostMapping("/generateReport")
    ResponseEntity<String> generateBill(@RequestBody(required = true) Map<String,Object> requestMap);
}
