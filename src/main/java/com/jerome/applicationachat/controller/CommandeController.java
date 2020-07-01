package com.jerome.applicationachat.controller;

import com.jerome.applicationachat.entities.Commande;
import com.jerome.applicationachat.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CommandeController {
    @Autowired
    private CommandeService commandeService;
    @GetMapping(value = "/commandes")
    public List<Commande> afficherLesCommandes(){
        return commandeService.findAll ();
    }
    @PostMapping(value = "/commandes/ {idCommande}")
    public Commande updateCommande(@PathVariable("idCommande") int idCommande, @RequestBody Commande commande ){
    commande.setIdCommande (idCommande);
    return  commandeService.updateCommande (commande);
    }
    @PostMapping (value = "commandes/{idCommande}")
    public Optional<Commande>  rechercherUneCommande(@PathVariable("idCommande") int idCommande){
        return  commandeService.findById (idCommande);
    }
}
