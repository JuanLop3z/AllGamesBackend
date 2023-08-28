package com.allgames.allgamesapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "idioma")
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
}
