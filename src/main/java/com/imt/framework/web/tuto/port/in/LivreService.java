package com.imt.framework.web.tuto.port.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imt.framework.web.tuto.adapter.out.LivreRepository;
import com.imt.framework.web.tuto.domaine.Livre;

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
