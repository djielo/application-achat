package com.jerome.applicationachat.dao;

import com.jerome.applicationachat.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {
}
