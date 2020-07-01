package com.jerome.applicationachat.dao;

import com.jerome.applicationachat.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository <Client,Integer> {
 @Query ("select c from Client c where c.nom =:nom")
   public Client searchByName(@Param ("nom") String nom);
}
