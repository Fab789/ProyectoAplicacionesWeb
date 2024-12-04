
package com.example.reviews.repository;

import com.example.reviews.modelo.Revisión;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioRevisión extends JpaRepository<Revisión, Long> {
    List<Revisión> findByRestaurantId(Long restauranteId);
    
}
