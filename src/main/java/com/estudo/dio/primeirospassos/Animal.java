package com.estudo.dio.primeirospassos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Animal {

    @Bean(name = "cachorro")
    public void Cachorro(){
        System.out.println("AuAu *SOM DE CACHORRO LATINDO");;
    }

    @Bean(name = "gato")
    public void Gato(){
        System.out.println("MiauMiau *SOM DE GATO MIANDO");
    }
}
