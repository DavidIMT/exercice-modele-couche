package com.imt.framework.web.tuto.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imt.framework.web.tuto.infrastructure.LivreRepository;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> listingBooks(){
        return new ArrayList<>(); // implémenter cette méthode
    }

    public Livre getBook(int id){
        Optional<Livre> livre = livreRepository.findById(id);
        return livre.get();
    }

    public void deleteBook(int id){
        //implémenter cette méthode
    }
}
