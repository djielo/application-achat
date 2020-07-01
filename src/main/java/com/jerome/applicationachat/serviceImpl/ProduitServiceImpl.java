package com.jerome.applicationachat.serviceImpl;

import com.jerome.applicationachat.dao.ProduitRepository;
import com.jerome.applicationachat.entities.Produit;
import com.jerome.applicationachat.exceptions.ProduitNotFoundException;
import com.jerome.applicationachat.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepository.save (produit);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll ();
    }

    @Override
    public Optional<Produit> findById(int idProduit) {
        Optional<Produit> unProduit= produitRepository.findById (idProduit);
        if(!unProduit.isPresent ()) throw new ProduitNotFoundException ("produit introuvable");
            return unProduit;

    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save (produit);
    }

    @Override
    public List<Produit> findByProductName(String nomProduit) {
        return produitRepository.findByProductName (nomProduit);
    }
}
