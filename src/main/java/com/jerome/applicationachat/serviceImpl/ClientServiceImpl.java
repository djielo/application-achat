package com.jerome.applicationachat.serviceImpl;

import com.jerome.applicationachat.dao.ClientRepository;
import com.jerome.applicationachat.entities.Client;
import com.jerome.applicationachat.exceptions.ClientNotFoundException;
import com.jerome.applicationachat.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client client) {
        return clientRepository.save (client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll ();
    }

    @Override
    public Optional <Client> findById(int idClient) {

        Optional<Client> unClient = clientRepository.findById (idClient) ;
        if(!unClient.isPresent ()) throw new ClientNotFoundException ("le client n'existe pas");
        return unClient;
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save (client);
    }

    @Override
    public Client searchByName(String nom) {
        return clientRepository.searchByName (nom);
    }
}
