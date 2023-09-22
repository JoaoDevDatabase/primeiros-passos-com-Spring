package com.estudo.dio.primeirospassos;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // vai ser elegivel para apenas classes
@Retention(RetentionPolicy.RUNTIME) // anotattion para poder transformar esta classe em uma anotattion
@Configuration
@Profile("services")
public @interface DesenvolvimentoServices {
}
