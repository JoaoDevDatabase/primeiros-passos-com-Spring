package com.estudo.dio.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Aplicação spring boot ( STARTER )
@RestController // Controlador REST
public class PrimeirosPassosSpringBoot {

   @Value("${application.name}")
    private String application;

    @GetMapping("/") // endereço de nossa url em no browser
    public String hello(){
        return  application;

    }

    public static void main(String[] args){
        SpringApplication.run(PrimeirosPassosSpringBoot.class, args);
    }
}
