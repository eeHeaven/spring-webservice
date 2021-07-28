package com.practice.webservice.web;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {

   @GetMapping("cookie")
    public String getCookie(@CookieValue("user") String user){
       return user+"님 안녕하세요!";
       //cookie의 경우 문법은 key=value 방식으로 작성하면 된다.
   }
}
