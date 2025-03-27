package com.renewx.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "datospersonales")
@Data
public class DatosPersonales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDatosPersonales;
    
    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreCompleto;

    @Column(name = "cedula", nullable = false, unique = true, length = 20)
    private String cedula;

    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
}

