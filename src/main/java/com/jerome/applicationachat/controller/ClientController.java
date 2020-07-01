package com.jerome.applicationachat.controller;

import com.jerome.applicationachat.entities.Client;
import com.jerome.applicationachat.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping (value = "/clients")
    public List<Client> afficherLesClients(){
    return clientService.findAll ();
    }
    @PostMapping(value = "/clients/{idClient}")
    public Client updateClient(@PathVariable("idClient") int idClient, @RequestBody Client client){
        client.setIdClient (idClient);
        return clientService.updateClient (client);
    }
    @PostMapping (value = "/client")
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient (client);
    }

    @GetMapping(value = "/clients/{idClient}")
    public Optional<Client> findById (@PathVariable("idClient") int idClient){
        return  clientService.findById (idClient);
    }
   @GetMapping (value = "/find")
   public Client searchByName(@RequestParam ("nom")String nom){
       return clientService.searchByName (nom);
   }
}
