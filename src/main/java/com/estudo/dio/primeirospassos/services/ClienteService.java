package com.estudo.dio.primeirospassos.services;

import com.estudo.dio.primeirospassos.model.Cliente;
import com.estudo.dio.primeirospassos.repository.ClienteRepository;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    public void SalvarCliente(ClienteRepository cliente){
         Cliente cliente1 = new Cliente();
        cliente.persistir(cliente1);
    }

    public void MensagemDeSalvo(){
        System.out.println("CLIENTE SALVO EM BANCO DE DADOS");
    }
}
