package com.imt.framework.web.tuto.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.imt.framework.web.tuto.domaine.Livre;


@Component
public interface LivreRepository extends JpaRepository<Livre, Integer> {

}
