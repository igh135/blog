package com.example.study.controller;

import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import lombok.Builder;
import org.springframework.web.bind.annotation.*;
import com.example.study.model.SearchParam;
@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET,path = "/getMethod") //localhost:8080/api/getMethod
    public String getRequest(){    //Hi getMethod 문자열 출력

        return "Hi, getMethod";
    }
    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam String password){ //localhost:8080/api/getParameter
        //id, password show on Terminal
        System.out.println("id"+ id);
        System.out.println("password"+password);

        return id+password;
    }
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){ //localhost:8080/api/getMultiParameter/?account=igh197&email=ighan65@naver.com&page=12

        return searchParam;
    }
    @GetMapping("/header")
    public Header getHeader(){

        return Header.builder().resultCode("OK").description("OK").build();
    }
}
