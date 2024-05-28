package com.npci.controller;

import com.npci.pojo.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("welcome to spring boot course");
    }

    @GetMapping(path="/hello-world-bean/{name}")
    public HelloWorldBean helloWorldBeanWithVariable(@PathVariable String name){
        return new HelloWorldBean("welcome to spring boot course " + name);
    }

}
