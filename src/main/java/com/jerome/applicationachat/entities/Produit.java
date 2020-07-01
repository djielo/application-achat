package com.jerome.applicationachat.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit")
    private int idProduit;
    @Column(name = "nom_produit")
    private String nomProduit;
    @Column(name = "prix_produit")
    private double prixProduit ;

//    @ManyToMany
//    @JoinTable(name = "produit_commande",
//            joinColumns = @JoinColumn(name = "id_produit"),
//            inverseJoinColumns = @JoinColumn(name = "id_commande"))
//    public List<Commande> commandes = new ArrayList<> ();

//    @ManyToMany
//    @JoinTable(name = "produit_type_produit",
//            joinColumns = @JoinColumn (name = "id_produit"),
//            inverseJoinColumns = @JoinColumn(name = "id_type_produit"))
//    private List<TypeProduit> typeProduitList = new ArrayList<> ();

    public Produit() {
    }

    public Produit(int idProduit, String nomProduit, double prixProduit) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

//    public List<Commande> getCommandes() {
//        return commandes;
//    }
//
//    public void setCommandes(List<Commande> commandes) {
//        this.commandes = commandes;
//    }

//    public List<TypeProduit> getTypeProduitList() {
//        return typeProduitList;
//    }
//
//    public void setTypeProduitList(List<TypeProduit> typeProduitList) {
//        this.typeProduitList = typeProduitList;
//    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", nomProduit='" + nomProduit + '\'' +
                ", prixProduit=" + prixProduit +
              //  ", commandes=" + commandes +
                '}';
    }
}
