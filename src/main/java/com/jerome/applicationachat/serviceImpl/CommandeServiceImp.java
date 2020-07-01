package com.jerome.applicationachat.serviceImpl;

import com.jerome.applicationachat.dao.CommandeRepository;
import com.jerome.applicationachat.entities.Client;
import com.jerome.applicationachat.entities.Commande;
import com.jerome.applicationachat.exceptions.CommandeNotFoundException;
import com.jerome.applicationachat.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeServiceImp implements CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save (commande);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll ();
    }

    @Override
    public Optional<Commande> findById(int idCommande) {

        Optional<Commande> uneCommande = commandeRepository.findById (idCommande);
        if (!uneCommande.isPresent ()) throw new CommandeNotFoundException ("commande introuvable");
        return uneCommande;
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save (commande);
    }
}
