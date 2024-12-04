
package com.example.reviews.service;

import com.example.reviews.modelo.Revisión;
import com.example.reviews.repository.RepositorioRevisión;
import java.util.List;


public class RevisiónServicios {
    private final RepositorioRevisión repositorioRevisión;
     public RevisiónServicios(RepositorioRevisión repositorioRevisión ) {
        this.repositorioRevisión = repositorioRevisión;
    }
     public Revisión añadirRevisión(Revisión revisión) {
        return repositorioRevisión.save(revisión);
    }
    public List<Revisión> obtenerRevisiónDeRestaurante(Long RestauranteId){
        return repositorioRevisión.findByRestaurantId(RestauranteId);
    }
}
