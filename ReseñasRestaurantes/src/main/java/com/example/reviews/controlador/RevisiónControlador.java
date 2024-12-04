
package com.example.reviews.controlador;

import com.example.reviews.modelo.Revisión;
import com.example.reviews.service.RevisiónServicios;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reviews")
public class RevisiónControlador {
    private final RevisiónServicios revisiónServicios;
    
    public RevisiónControlador(RevisiónServicios revisiónServicios) {
        this.revisiónServicios = revisiónServicios;
    }
     @PostMapping
    public Revisión añadirRevisión(@RequestBody Revisión revisión) {
        return revisiónServicios.añadirRevisión(revisión);
    }

    @GetMapping("/{restaurantId}")
    public List<Revisión> obtenerRevisiónRestaurantes(@PathVariable Long restaurantId) {
        return revisiónServicios.obtenerRevisiónDeRestaurante(restaurantId);
    }

    
}
