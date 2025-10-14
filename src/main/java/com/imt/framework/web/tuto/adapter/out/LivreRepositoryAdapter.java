package com.imt.framework.web.tuto.adapter.out;

import java.util.List;
import java.util.Optional;

import com.imt.framework.web.tuto.domaine.Livre;
import com.imt.framework.web.tuto.port.out.LivreRepositoryPort;

public class LivreRepositoryAdapter implements LivreRepositoryPort{
    private final LivreRepository livreRepository; // ton interface JPA

    public LivreRepositoryAdapter(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    @Override
    public Livre save(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Optional<Livre> findById(Integer id) {
        return livreRepository.findById(id);
    }

    @Override
    public List<Livre> findAll() {
        return livreRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        livreRepository.deleteById(id);
    }

    @Override
    public void updateBook(Livre livre){
        livreRepository.save(livre);
    }
}
