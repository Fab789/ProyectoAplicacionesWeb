
package com.example.reviews.repository;

import com.example.reviews.modelo.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RestauranteRepositorio extends JpaRepository<Restaurante, Long> {
}