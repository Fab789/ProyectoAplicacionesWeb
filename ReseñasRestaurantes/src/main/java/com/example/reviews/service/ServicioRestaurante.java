
package com.example.reviews.service;

import com.example.reviews.modelo.Restaurante;
import com.example.reviews.repository.RestauranteRepositorio;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServicioRestaurante {
    private final RestauranteRepositorio restauranteRepositorio;
    public ServicioRestaurante(RestauranteRepositorio restauranteRepositorio) {
        this.restauranteRepositorio = restauranteRepositorio;
    }  
        public Restaurante añadirRestaurante(Restaurante restaurante) {
        return restauranteRepositorio.save(restaurante);
    }
        public List<Restaurante> getAllRestaurants() {
        return restauranteRepositorio.findAll();
    }
    
}
