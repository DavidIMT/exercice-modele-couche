package com.imt.framework.web.tuto.port.out;

import java.util.List;
import java.util.Optional;

import com.imt.framework.web.tuto.domaine.Livre;

public interface LivreRepositoryPort {
    Livre save(Livre livre);
    Optional<Livre> findById(Integer id);
    List<Livre> findAll();
    void deleteById(Integer id);
    void updateBook(Livre livre);
}
