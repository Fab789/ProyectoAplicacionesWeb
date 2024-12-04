
package com.example.reviews.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Revisión {
    
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      
      private Long id;

    private String NombreRevisor;

    private String comentario;

    private int calificación; // Calificación de 1 a 5 estrellas
    
    private LocalDateTime FechaRevision;
    
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurante restaurante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRevisor() {
        return NombreRevisor;
    }

    public void setNombreRevisor(String NombreRevisor) {
        this.NombreRevisor = NombreRevisor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificación() {
        return calificación;
    }

    public void setCalificación(int calificación) {
        this.calificación = calificación;
    }

    public LocalDateTime getFechaRevision() {
        return FechaRevision;
    }

    public void setFechaRevision(LocalDateTime FechaRevision) {
        this.FechaRevision = FechaRevision;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    


}
