package com.jerome.applicationachat.service;

import com.jerome.applicationachat.entities.Commande;
import com.jerome.applicationachat.entities.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {
    public Produit saveProduit(Produit produit);
    public List<Produit> findAll() ;
    public Optional<Produit> findById(int idProduit);
    public Produit updateProduit(Produit produit);
    public List<Produit> findByProductName(String nomProduit);
}
