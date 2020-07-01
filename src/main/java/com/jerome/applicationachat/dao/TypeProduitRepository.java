package com.jerome.applicationachat.dao;

import com.jerome.applicationachat.entities.TypeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit,Integer> {

}
