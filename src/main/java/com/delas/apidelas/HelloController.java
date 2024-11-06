package com.delas.apidelas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // vai lidar com requisicoes HTTP.
@RequestMapping("/api") // define que todos os endpoints dessa classe vao começar com /api
public class HelloController {

    @GetMapping("/hello") // define que o método sayHello será acionado quando a URL /api/hello for acessada via método GET.
    public String sayHello() {
        return "Hello, World!";
    }
}
