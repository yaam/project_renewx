package com.renewx.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data

public class Usuario {
    @Id
    @Column(name = "idusuario")
    private Integer idusuario;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "pass_user")
    private String passUser;

    @Column(name = "estado_user", nullable = false)
    private Boolean estadoUser;
}
