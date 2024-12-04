
package com.example.reviews.controlador;

import com.example.reviews.modelo.Restaurante;
import com.example.reviews.service.ServicioRestaurante;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurants")
public class RestauranteControlador {
     private final ServicioRestaurante restaurantService;
    public RestauranteControlador(ServicioRestaurante servicioRestaurante) {
        this.restaurantService = servicioRestaurante;
    }
     @PostMapping
    public Restaurante añadirRestaurante(@RequestBody Restaurante restaurante) {
        return restaurantService.añadirRestaurante(restaurante);
    }
    @GetMapping
    public List<Restaurante> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}
