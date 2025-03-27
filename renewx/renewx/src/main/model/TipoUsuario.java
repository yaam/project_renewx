package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List; 


@Data 
@Entity
@Table(name = "tipoUsuario")

public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipousuario;

    @Column(nullable = false, length = 50)
    private String nombre_tipo;


}

