package com.imt.framework.web.tuto.presentation;

import com.imt.framework.web.tuto.application.Livre;
import com.imt.framework.web.tuto.application.LivreService;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Path("/books")
public class LivreResource {

    @Autowired
    private LivreService livreService;

    @GET
    @Produces("application/json")
    public Response getBooks(){
        //appel à la logique métier
        return Response.ok()
               .entity(new ArrayList<>()) //résultat de l'appel à la logique métier
               .header("Access-Control-Allow-Origin", "*")
               .build();
    }

    @POST
    @Consumes("application/json")
    public void createBook(@NotNull @RequestBody LivreDTO livreDTO){
        //appel à la logique métier
    }

    @PATCH
    @Consumes
    @Path("/{id}")
    public void updateBook(@NotNull @PathParam("id") Integer id, @NotNull @RequestBody LivreDTO livreDTO) throws Exception {
        
        Livre l = livreService.getBook(id);

        if(null == l) {
            throw new Exception("Livre inconnu");
        }
        else {
            //mise a jour du livre avec les données de livreDTO

            //appel à la méthode de sauvegarde d'un livre
        }
    }

    @DELETE
    @Path("/{id}")
    public void deleteBook(@NotNull @PathParam("id") final Integer id){
        livreService.deleteBook(id);
    }
}
