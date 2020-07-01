package com.jerome.applicationachat.service;

import com.jerome.applicationachat.entities.Commande;
import com.jerome.applicationachat.entities.TypeProduit;

import java.util.List;
import java.util.Optional;

public interface TypeProduitService {
    public TypeProduit saveTypeProduit(TypeProduit typeProduit);
    public List<TypeProduit> findAll() ;
    public Optional<TypeProduit> findById(int idTypeProduit);
    public TypeProduit updateTypeProduit(TypeProduit typeProduit);
}
