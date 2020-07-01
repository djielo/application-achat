package com.jerome.applicationachat.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "type_produit")
public class TypeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_produit")
    private int idTypeProduit;
    @Column(name = "nom_type_produit")
    private String nomTypeProduit;
    @ManyToMany
    @JoinTable(name = "produit_type_produit",
            joinColumns = @JoinColumn(name = "id_produit"),
            inverseJoinColumns = @JoinColumn(name = "id_type_produit"))
    private List<Produit> produitList = new ArrayList<> ();

    public TypeProduit() {
    }

    public TypeProduit(int idTypeProduit, String nomTypeProduit) {
        this.idTypeProduit = idTypeProduit;
        this.nomTypeProduit = nomTypeProduit;
    }

    public int getIdTypeProduit() {
        return idTypeProduit;
    }

    public void setIdTypeProduit(int idTypeProduit) {
        this.idTypeProduit = idTypeProduit;
    }

    public String getNomTypeProduit() {
        return nomTypeProduit;
    }

    public void setNomTypeProduit(String nomTypeProduit) {
        this.nomTypeProduit = nomTypeProduit;
    }

    @Override
    public String toString() {
        return "TypeProduit{" +
                "idTypeProduit=" + idTypeProduit +
                ", nomTypeProduit='" + nomTypeProduit + '\'' +

                '}';
    }
}
