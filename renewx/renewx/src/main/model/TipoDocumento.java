package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipodocumentos")
@Data
public class TipoDocumento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoDocumento;

    @Column(nullable = false, length = 100)  // Evita nulos y define longitud máxima
    private String nombreTipoDocumento;
}
