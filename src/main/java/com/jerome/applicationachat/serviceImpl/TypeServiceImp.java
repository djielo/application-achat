package com.jerome.applicationachat.serviceImpl;

import com.jerome.applicationachat.dao.TypeProduitRepository;
import com.jerome.applicationachat.entities.TypeProduit;
import com.jerome.applicationachat.exceptions.TypeProduitNotFoundException;
import com.jerome.applicationachat.service.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypeServiceImp implements TypeProduitService {
    @Autowired
    private TypeProduitRepository typeProduitRepository;
    @Override
    public TypeProduit saveTypeProduit(TypeProduit typeProduit) {
        return typeProduitRepository.save (typeProduit);
    }

    @Override
    public List<TypeProduit> findAll() {
        return typeProduitRepository.findAll ();
    }

    @Override
    public Optional<TypeProduit> findById(int idTypeProduit) {

        Optional<TypeProduit> unTypeProduit= typeProduitRepository.findById (idTypeProduit);
        if(!unTypeProduit.isPresent ()) throw new TypeProduitNotFoundException ("la recherche ne correspond à aucun type de produit");
        return  unTypeProduit;
    }

    @Override
    public TypeProduit updateTypeProduit(TypeProduit typeProduit) {
        return typeProduitRepository.save (typeProduit);
    }
}
