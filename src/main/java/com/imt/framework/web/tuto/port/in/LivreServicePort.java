package com.imt.framework.web.tuto.port.in;

import java.util.List;

import com.imt.framework.web.tuto.domaine.Livre;

public interface LivreServicePort {
    public List<Livre> listingBooks();

    public Livre getBook(int id);

    public void deleteBook(int id);
}
