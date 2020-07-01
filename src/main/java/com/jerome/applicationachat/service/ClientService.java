package com.jerome.applicationachat.service;

import com.jerome.applicationachat.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public Client saveClient(Client client);
    public List<Client> findAll() ;
    public Optional <Client> findById(int idClient);
    public Client updateClient(Client client);
   public Client searchByName(String nom);

}
