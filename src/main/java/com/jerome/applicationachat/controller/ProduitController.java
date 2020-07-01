package com.jerome.applicationachat.controller;

import com.jerome.applicationachat.entities.Produit;
import com.jerome.applicationachat.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping(value = "/produits")
    public List<Produit> afficherLesProduit() {
        return produitService.findAll ();
    }

    @PostMapping(value = "/produits/{idProduit}")
    public Produit updateProduit(@PathVariable("idProduit") int idProduit, @RequestBody Produit produit) {
        produit.setIdProduit (idProduit);
        return produitService.updateProduit (produit);
    }

    @GetMapping(value = "/produits/{idProduit}")
    public Optional<Produit> findById(@PathVariable("idProduit") int idProduit) {
        return produitService.findById (idProduit);
    }

    @PostMapping(value = "/produit")
    public Produit saveProduit(@RequestBody Produit produit) {
        return produitService.saveProduit (produit);
    }
    @GetMapping(value = "/finds")
    public List<Produit> searchProductByName(@RequestParam("nom_produit") String nomProduit) {
        return produitService.findByProductName (nomProduit);

    }

}
