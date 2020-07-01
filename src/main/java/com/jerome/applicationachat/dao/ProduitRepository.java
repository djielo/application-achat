package com.jerome.applicationachat.dao;

import com.jerome.applicationachat.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Integer> {
    @Query ("select p from Produit p where p.nomProduit = :nom_produit")
    public List<Produit> findByProductName(@Param ("nom_produit") String nomProduit);

}
