package com.jerome.applicationachat.controller;

import com.jerome.applicationachat.entities.TypeProduit;
import com.jerome.applicationachat.service.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TypeProduitController {
    @Autowired
    private TypeProduitService typeProduitService;
    @GetMapping(value = "/types")
    public List<TypeProduit> afficherLesTypeProduit(){
        return typeProduitService.findAll ();
    }
    @PostMapping(value = "/types")
    public  TypeProduit saveTypeProduit(@RequestBody TypeProduit typeProduit){
        return typeProduitService.saveTypeProduit (typeProduit);

    }
    @PostMapping(value = "/types/{idTypeProduit}")
    public TypeProduit updateProduit(@PathVariable("idTypeProduit") int idTypeProduit,@RequestBody TypeProduit typeProduit){
       typeProduit.setIdTypeProduit (idTypeProduit);
       return typeProduitService.updateTypeProduit (typeProduit);
    }
    @GetMapping(value = "/types/{idTypeProduit}")
    public Optional<TypeProduit> findById (@PathVariable("idTypeProduit") int idTypeProduit){
        return typeProduitService.findById (idTypeProduit);

    }
}
