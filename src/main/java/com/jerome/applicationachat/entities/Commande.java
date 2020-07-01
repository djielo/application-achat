package com.jerome.applicationachat.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande")
    private int idCommande;
    @Column(name = "quantite_commande")
    private double quantiteCommande;
    @Column(name = "date_de_commande")
    private Date dateDeCommande;
    @Column(name = "date_de_livraison")
    private Date dateDeLivraison;
    @ManyToOne
   // @JsonManagedReference
    @JoinColumn(name = "id_client")
    private Client client;
    @ManyToMany
    @JoinTable(name = "produit_commande",
            joinColumns = @JoinColumn(name = "id_commande"),
            inverseJoinColumns = @JoinColumn(name = "id_produit"))
    public List<Produit> produitList = new ArrayList<> ();

    public Commande() {
    }

    public Commande(int idCommande, double quantiteCommande, Date dateDeCommande, Date dateDeLivraison, Client client) {
        this.idCommande = idCommande;
        this.quantiteCommande = quantiteCommande;
        this.dateDeCommande = dateDeCommande;
        this.dateDeLivraison = dateDeLivraison;
        this.client = client;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public double getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(double quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    public Date getDateDeCommande() {
        return dateDeCommande;
    }

    public void setDateDeCommande(Date dateDeCommande) {
        this.dateDeCommande = dateDeCommande;
    }

    public Date getDateDeLivraison() {
        return dateDeLivraison;
    }

    public void setDateDeLivraison(Date dateDeLivraison) {
        this.dateDeLivraison = dateDeLivraison;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", quantiteCommande=" + quantiteCommande +
                ", dateDeCommande=" + dateDeCommande +
                ", dateDeLivraison=" + dateDeLivraison +

                '}';
    }
}
