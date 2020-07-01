package com.jerome.applicationachat.service;

import com.jerome.applicationachat.entities.Client;
import com.jerome.applicationachat.entities.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {
    public Commande saveCommande(Commande commande);
    public List<Commande> findAll() ;
    public Optional<Commande> findById(int idCommande);
    public Commande updateCommande(Commande commande);

}
