package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;
import lombook.Date;

@Data
@Entity
@Table(name = "roles")

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;

    @Column(nullable = false, length = 50)
    private String nombre_rol;

}
