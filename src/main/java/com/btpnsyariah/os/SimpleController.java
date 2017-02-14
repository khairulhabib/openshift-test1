package com.btpnsyariah.os;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Habib on 2/13/2017.
 */
@RestController
public class SimpleController {

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return "Springboot " + name;
    }

    @GetMapping(value = "/hello1/{string}")
    public String hello1(@PathVariable String string){
        return "Some new String " + string;
    }
}
