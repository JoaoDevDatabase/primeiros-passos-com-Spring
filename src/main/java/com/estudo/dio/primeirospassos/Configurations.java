package com.estudo.dio.primeirospassos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// NA MINHA CLASSE DE CONFIGURAÇÃO, VAMOS COLOCAR APENAS CLASSES DE CONFIGURAÇÕES !!
@Configuration
@DesenvolvimentoServices
@AnimalAnnotation
public class Configurations {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("APLICAÇÃO INICIADA COM SUCESSO  ");
        };
    }

    @Qualifier("gato")
    public CommandLineRunner run(){
        return args -> {
          Animal animal = new Animal();
          animal.Gato();
        }; 
    }


}
